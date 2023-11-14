package com.saveurlife.goodnews.api

// request
data class RequestPlaceCanUse(val canuse:Boolean)
data class RequestPlaceInfo(val name:String, val lat:Double, val lon:Double)
data class RequestPlaceId(val placeId:Int)
data class RequestFamilyRegist(val memberId:String, val familyId:String)
data class RequestPlaceDetailInfo(val memberId:String, val name:String, val lat:Double, val lon:Double)

// response
data class ResponsePlaceUseUpdate(val success:Boolean, val message:String, val data:Map<String, Any>)
data class ResponsePlaceUpdate(val success:Boolean, val message:String, val data:Map<String, Any>)
data class ResponseFamilyUpdate(val success:Boolean, val message:String, val data:Map<String, Any>)
data class ResponsePlaceRegist(val success:Boolean, val message:String, val data:PlaceDetailInfo)
data class ResponseFamilyRegist(val success:Boolean, val message:String, val data:FamilyId)
data class ResponsePlaceDetail(val success:Boolean, val message:String, val data:PlaceDetailInfo)
data class ResponseMemberInfo(val success:Boolean, val message:String, val data:ArrayList<FamilyInfo>)
data class ResponsePlaceInfo(val success:Boolean, val message:String, val data:ArrayList<PlaceInfo>)

data class PlaceDetailInfo(val placeId:Int, val name:String, val lat:Double, val lon:Double, val canuse:Boolean)
data class PlaceInfo(val placeId: Int, val name: String, val canuse: Boolean, val seq:Int)
data class FamilyId(val familyId: String)
data class FamilyInfo(val memberId: String, val phoneNumber: String, val name: String, val lastConnection:String, val state:String, val familyId: String)





