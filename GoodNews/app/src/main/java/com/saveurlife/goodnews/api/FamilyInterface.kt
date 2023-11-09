package com.saveurlife.goodnews.api

import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface FamilyInterface {

    // 가족 모임장소 사용 여부 수정
    @PUT("family/placeuse/{placeId}")
    fun getFamiliyUpdatePlaceCanUse(@Path("placeId") placeId: Int, @Body placeCanUse: RequestBody):Call<ResponsePlaceUseUpdate>

    // 가족 모임장소 수정
    @PUT("family/placeinfo/{placeId}")
    fun getFamilyUpdatePlaceInfo(@Path("placeId") placeId: Int, @Body placeModify: RequestBody):Call<ResponsePlaceUpdate>

    // 가족 신청 수락
    @PUT("family/acceptfamily")
    fun updateRegistFamily(@Body memberId: RequestBody):Call<ResponseFamilyUpdate>

    // 가족 모임 장소 등록
    @POST("family/registplace")
    fun registFamilyPlace(@Body placeRegist: RequestBody):Call<ResponsePlaceRegist>

    // 가족 신청 요청
    @POST("family/registfamily")
    fun registFamily(@Body familyRegist: RequestBody):Call<ResponseFamilyRegist>

    // 가족 모임장소 상세 조회
    @POST("family/placeinfo")
    fun getFamilyPlaceInfoDetail(@Body placeId: RequestBody):Call<ResponsePlaceDetail>

    // 가족 구성원 조회
    @POST("family/familyinfo")
    fun getFamilyMemberInfo(@Body memberId: RequestBody):Call<ResponseMemberInfo>

    //가족 모임장소 조회
    @POST("family/allplaceinfo")
    fun getFamilyPlaceInfo(@Body memberId: RequestBody):Call<ResponsePlaceInfo>
}