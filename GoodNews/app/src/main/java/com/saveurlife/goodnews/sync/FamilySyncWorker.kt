package com.saveurlife.goodnews.sync

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.saveurlife.goodnews.GoodNewsApplication
import com.saveurlife.goodnews.api.FamilyAPI
import com.saveurlife.goodnews.api.FamilyInfo
import com.saveurlife.goodnews.api.MapAPI
import com.saveurlife.goodnews.api.MemberAPI
import com.saveurlife.goodnews.api.MemberInfo
import com.saveurlife.goodnews.api.PlaceDetailInfo
import com.saveurlife.goodnews.api.PlaceInfo
import com.saveurlife.goodnews.main.PreferencesUtil
import com.saveurlife.goodnews.models.FamilyMemInfo
import com.saveurlife.goodnews.models.FamilyPlace
import com.saveurlife.goodnews.service.UserDeviceInfoService
import io.realm.kotlin.Realm
import io.realm.kotlin.ext.query
import io.realm.kotlin.types.RealmInstant
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.concurrent.TimeUnit
import kotlin.properties.Delegates

class FamilySyncWorker  (context: Context, workerParams: WorkerParameters) : Worker(context, workerParams){
    private lateinit var realm : Realm
    private lateinit var preferences: PreferencesUtil
    private lateinit var phoneId:String
    private var syncTime by Delegates.notNull<Long>()
    private lateinit var mapAPI: MapAPI
    private lateinit var familyAPI: FamilyAPI
    private lateinit var memberAPI: MemberAPI
    private var newTime by Delegates.notNull<Long>()
    // 다른 곳에서 가져가서 사용할 경우 아래의 코드를 가져가서 실행해주세요!
    /*
        // WorkManager
        private lateinit var workManager:WorkManager
        workManager = WorkManager.getInstance(applicationContext)

        // 조건 설정 - 인터넷 연결 시에만 실행
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()

        // request 생성
        val updateRequest = OneTimeWorkRequest.Builder(FamilySyncWorker::class.java)
            .setConstraints(constraints)
            .build()

        // 실행
        workManager.enqueue(updateRequest)
     */
    interface SyncCompleteListener {
        fun onSyncComplete()
    }
    override fun doWork(): Result {
        val userDeviceInfoService = UserDeviceInfoService(applicationContext)


        preferences = GoodNewsApplication.preferences
        phoneId = userDeviceInfoService.deviceId
        syncTime = preferences.getLong("SyncTime",0L)

        mapAPI = MapAPI()
        familyAPI = FamilyAPI()
        memberAPI = MemberAPI()
        realm = Realm.open(GoodNewsApplication.realmConfiguration)

        newTime = System.currentTimeMillis()
//        newTime += TimeUnit.HOURS.toMillis(9)


        try {
            runBlocking {
                Log.d("etttt", "워커 안에서 시작")
                // 2. 가족 구성원 정보 -> familymem_info
                fetchDataFamilyMemInfo()
                // 3. 가족 모임 장소 -> family_place
                fetchDataFamilyPlace()
                Log.d("etttt", "워커가 찐 끝")
            }
            Log.d("tetttt", "여기실행되면 울거임")
            return Result.success()
        } catch (e : Exception){
            Log.d("Family Sync", "데이터를 불러오지 못했습니다." +e.toString())
            return Result.failure()
        } finally {
            Log.d("Family Sync", "최신 정보로 업데이트 했습니다.")
        }


    }

    // 가족 구성원 정보
    private fun fetchDataFamilyMemInfo() {
        // 온라인 일때만 수정 하도록 만들면 될 것 같다.
//        realm = Realm.open(GoodNewsApplication.realmConfiguration)


        GlobalScope.launch {
            realm.writeBlocking {
                query<FamilyMemInfo>().find()
                    ?.also { delete(it) }
            }
        }
        // 가족 정보를 받아와 realm을 수정한다.
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")

        familyAPI.getFamilyMemberInfo(phoneId, object : FamilyAPI.FamilyCallback {
            override fun onSuccess(result: ArrayList<FamilyInfo>) {
                result.forEach{
                    var tempTime = it.lastConnection
                    val localDateTime = LocalDateTime.parse(tempTime, formatter)
                    val milliseconds =
                        localDateTime.atZone(ZoneId.of("UTC")).toInstant().toEpochMilli()
                    memberAPI.findMemberInfo(it.memberId, object :MemberAPI.MemberCallback{

                        override fun onSuccess(result2: MemberInfo) {
                            Log.d("family", "저장 시작")
                            realm.writeBlocking {
                                copyToRealm(
                                    FamilyMemInfo().apply {
                                        id = it.memberId
                                        name = it.name
                                        phone = it.phoneNumber
                                        lastConnection = RealmInstant.from(milliseconds / 1000, (milliseconds % 1000).toInt())
                                        state = it.state
                                        latitude = result2!!.lat
                                        longitude = result2!!.lon
                                        familyId = it.familyId
                                    })
                            }
                            Log.d("family", "저장 끝")
                        }

                        override fun onFailure(error: String) {
                            Log.d("family", "저장 실패")
                        }

                    })
                }
            }
            override fun onFailure(error: String) {
                // 실패 시의 처리
                Log.d("Family", "Registration failed: $error")
            }
        })
//        realm.close()
    }

    // 가족 모임 장소
    private fun fetchDataFamilyPlace() {
        // 내가 변경한 장소 수정
        val allData = realm.query<FamilyPlace>().find()
        allData.forEach {
            familyAPI.getFamiliyUpdatePlaceCanUse(it.placeId, it.canUse)
            familyAPI.getFamilyUpdatePlaceInfo(
                it.placeId,
                it.name,
                it.latitude,
                it.longitude
            )
        }

        // 장소의 새로운 상태를 받아온다
        // 어짜피 3개 밖에 없으므로 다 삭제후 넣는다.


        GlobalScope.launch {
            realm.writeBlocking {
                query<FamilyPlace>().find()
                    ?.also { delete(it) }
            }
        }

        // realm에 저장한다.
        familyAPI.getFamilyPlaceInfo(phoneId, object : FamilyAPI.FamilyPlaceCallback {
            override fun onSuccess(result: ArrayList<PlaceInfo>) {
                result.forEach{
                    familyAPI.getFamilyPlaceInfoDetail(it.placeId, object : FamilyAPI.FamilyPlaceDetailCallback{
                        override fun onSuccess(result2: PlaceDetailInfo) {
                            realm.writeBlocking {
                                copyToRealm(
                                    FamilyPlace().apply {
                                        placeId = result2.placeId
                                        name = result2.name
                                        latitude = result2.lat
                                        longitude = result2.lon
                                        canUse = result2.canuse
                                        seq = it.seq
                                    }
                                )
                            }
                        }
                        override fun onFailure(error: String) {

                        }
                    })
                }
            }
            override fun onFailure(error: String) {

            }
        })
    }
}