package com.saveurlife.goodnews.map

import android.util.Log
import com.saveurlife.goodnews.GoodNewsApplication
import com.saveurlife.goodnews.models.MapInstantInfo
import com.saveurlife.goodnews.models.Member
import io.realm.kotlin.Realm
import io.realm.kotlin.exceptions.RealmException
import io.realm.kotlin.ext.query
import io.realm.kotlin.query.RealmResults
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sqrt

class EmergencyAlarmProvider {

    private lateinit var realm: Realm
    private lateinit var userInfo:RealmResults<Member>
    private lateinit var userSpecificInfo:Member
    private lateinit var targetInfo: RealmResults<MapInstantInfo>
    private var closeInfo = mutableListOf<MapInstantInfo>()

    fun getAlarmInfo(): MapInstantInfo? {

        var mostRecentInfo: MapInstantInfo? = null

        CoroutineScope(Dispatchers.IO).launch {
            try {
                realm = Realm.open(GoodNewsApplication.realmConfiguration)

                // 나의 위치 조회
                userInfo = realm.query<Member>().find()

                val user = userInfo.firstOrNull() // 강제 언래핑 대신 안전한 접근 방식 사용
                user?.let {
                    // 모든 위험 정보 조회
                    targetInfo = realm.query<MapInstantInfo>("state = $0", "1").find()

                    // 20m 이내에 있는 정보라면! 다시 가까운 정보 리스트에 담고
                    targetInfo.forEach { info ->
                        if (getRoughDistance(
                                info.latitude,
                                info.longitude,
                                it.latitude,
                                it.longitude
                            ) <= 20
                        ) {
                            closeInfo.add(
                                copyMapInstantInfo(info)
                            )
                        }
                    }
                    mostRecentInfo = closeInfo.maxByOrNull { it.time.epochSeconds }
                }
            } catch (e: RealmException) {
                Log.e("EmergencyAlarmProvider", "Realm 작업 중 에러 발생", e)
            }finally {
                realm.close()
            }

            mostRecentInfo?.let {
                Log.v("mostRecentInfo", "가장 최근 정보: ${it.content}")
            }

        }
        return mostRecentInfo
    }

    // realm 객체에서 직접 작업 불가 -> 복사
    fun copyMapInstantInfo(info: MapInstantInfo): MapInstantInfo {
        return MapInstantInfo().apply {
            this.state = info.state
            this.latitude = info.latitude
            this.longitude = info.longitude
            this.content = info.content
            this.time = info.time
        }
    }


    fun getRoughDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {

        // 위도와 경도 차이 계산
        val latDifference = abs(lat1 - lat2)
        val lonDifference = abs(lon1 - lon2)

        // 위도와 경도의 차이를 미터로 환산
        val latDistance = latDifference * 111000
        val lonDistance = lonDifference * cos(Math.toRadians(lat1)) * 111000

        // 사각형 대각선 거리 계산
        return sqrt(latDistance * latDistance + lonDistance * lonDistance)
    }
}