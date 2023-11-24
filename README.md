<div align="center">
  <img src="./img/goodnews_logo.png" width="20%"/>
</div>

<br/>

<div align="center">
  <h1>희소식</h1> 
  
지진,전쟁과 같은 재난 상황에서 통신이 끊겼을 경우 ,

가족들과 연락 또는 주변 사람들에게 문자를 보내서 도움을 받고 싶을 때,

모스부호나 구조요청를 통해 구조 도움을 받고 싶을 때, 

저희는 이와 같은 상황을 위해 “희소식” 서비스를 고안했습니다.
</div>

<br>


## 👪 개발 멤버 소개

<table> <tr> 
<td height="140px" align="center"> <a href="https://github.com/rileyleee"> <img src="https://avatars.githubusercontent.com/u/116135258?v=4" width="120px" /> <br><br> 👑 이은경 <br>(BackEnd)<br/> </a> <br></td>  
<td height="140px" align="center"> <a href="https://github.com/kimnayeon16"> <img src="https://avatars.githubusercontent.com/u/87288958?v=4" width="120px" /> <br><br> 😶 김나연 <br>(FrontEnd) </a> <br></td> 
<td height="140px" align="center"> <a href="https://github.com/Kim-Yejinn"> <img src="https://avatars.githubusercontent.com/u/123815209?v=4" width="120px" /> <br><br> 🙄 김예진 <br>(BackEnd)<br/> </a> <br></td> 
<td height="140px" align="center"> <a href="https://github.com/seondy"> <img src="https://avatars.githubusercontent.com/u/122539170?v=4" width="120px" /> <br><br> 😆 선다영 <br>(FrontEnd) </a> <br></td>
<td height="140px" align="center"> <a href="https://github.com/sseq007"> <img src="https://avatars.githubusercontent.com/u/63395794?v=4" width="120px" /> <br><br> 😁 신준호 <br>(BackEnd) </a> <br></td> 
<td height="140px" align="center"> <a href="https://github.com/elle6044"> <img src="https://avatars.githubusercontent.com/u/123047819?v=4" width="120px" /> <br><br> 🙂 이준용 <br>(BackEnd) </a> <br></td> </tr> 
</table>

<br />

## 📆 프로젝트 기간

### 23.10.09. ~ 23.11.17

<br />

## 🗂️ 프로젝트 구성

<details>
<summary>APP 폴더 구조</summary>


```Plain Text

📦GoodNews
 ┣ 📂app
 ┃ ┣ 📂release
 ┃ ┃ ┣ 📜app-release.apk
 ┃ ┃ ┗ 📜output-metadata.json
 ┃ ┣ 📂src
 ┃ ┃ ┣ 📂androidTest
 ┃ ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂saveurlife
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ExampleInstrumentedTest.kt
 ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂saveurlife
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂alarm
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AlarmActivity.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AlarmDatabaseManger.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AlarmFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AlarmRepository.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂api
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyAPI.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyInterface.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapAPI.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapInterface.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberAPI.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberInterface.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂ble
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂adapter
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BleAdvertiseAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BleConnectedAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂advertise
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AdvertiseManager.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂bleGattClient
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BleGattCallback.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂bleGattServer
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BleGattServerCallback.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂message
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AutoSendMessageService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatDatabaseManager.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GroupDatabaseManager.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MessageBase.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MessageChat.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MessageHelp.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SendMessageManager.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂scan
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ScanManager.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BleService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BleFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BleMeshAdvertiseData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BleMeshConnectedUser.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRepository.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Common.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CurrentActivityEvent.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GroupRepository.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapAdapter.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PermissionUtils.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂chatting
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChattingAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChattingDetailActivity.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChattingDetailAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChattingDetailData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChattingFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChooseGroupMemberActivity.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChooseGroupMemberAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChooseGroupMemberFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GroupChattingAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GroupChattingFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OneChattingAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OnechattingData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OneChattingFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SharedViewModel.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂enterinfo
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜EnterInfoActivity.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂family
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyAddFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyListAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyPlaceAddEditFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MeetingPlaceData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂flashlight
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FlashlightData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FlashlightFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FlashlightListAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜FlashlightRecordAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂group
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GroupData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GroupFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜GroupPageAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyAlarmFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜HomeFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainActivity.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainAroundAdvertiseFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainAroundListFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainFamilyAroundListFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainMeshFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapAlarmFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MyStatusDialogFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MyStatusFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PermissionsUtil.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PreferencesUtil.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂map
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BackgroundLocationProvider.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ConnectedUserMarkerOverlay.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ConnectedUserProvider.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜EmergencyAlarmProvider.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜EmergencyInfoDialogFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityCategoryAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityListAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityProvider.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LocationProvider.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapDownloader.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MyLocationMarkerOverlay.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OtherUserInfoFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂models
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AidKit.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Alert.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Chat.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatMessage.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityType.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityUIType.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyMemInfo.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyPlace.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GroupMemInfo.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapInstantInfo.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Member.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MorseCode.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OffMapFacility.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂mypage
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MyPageFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DeviceStateService.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LocationService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LocationTrackingService.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserDeviceInfoService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂sync
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DataSyncWorker.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilySyncWorker.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜InitSyncWorker.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SyncService.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂tutorial
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜TutorialActivity.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜TutorialData.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TutorialPageAdapter.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂wifidirect
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WifiDirectFragment.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GoodNewsApplication.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoadingActivity.kt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapsFragment.kt
 ┃ ┃ ┃ ┣ 📂res
 ┃ ┃ ┃ ┃ ┣ 📂anim
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fade_in.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fade_in_animation.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜scale_in.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜scale_out.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜slide_in_left.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜slide_in_right.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜slide_out_left.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜slide_out_right.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜slide_up.xml
 ┃ ┃ ┃ ┃ ┣ 📂drawable
 ┃ ┃ ┃ ┃ ┃ ┣ 📜active_rounded_background_with_shadow.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜alarm_chatting.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜alarm_location.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_account_circle_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_add_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_add_circle_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_calendar_month_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_cancel_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_chevron_left_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_clear_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_content_copy_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_family_restroom_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_flashlight_on_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_home_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_my_location_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_person_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_pin_drop_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_refresh_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜baseline_warning_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜blood.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜btn_match_parent.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜btn_sub.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜btn_white.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜card_component.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜chatting_new.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜danger_radius_wrap.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dash_line.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_blt.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_chatting.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_donut.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_donut_ble.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_donut_wifi.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_sound.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜emergency_track_selector.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜enter_chatting.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜facility_color_selector.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜facility_sub_color_selector.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜facility_text_color_selector.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜family_regist.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜good_news_logo.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜help_alert.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜help_button.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_add.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_attention.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_baseline_push_pin_24.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_check.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_family.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_goodnews.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_grocery.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_hospital.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher_background.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_meeting_place.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_pin.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_shelter.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜input_stroke.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜input_stroke_none.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜input_stroke_selected.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜main_dialog_flashlight.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜main_no_wifi.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜map_location.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜menu_selector.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜mypage_blood.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜mypage_help_arrow.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜my_status_circle.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜my_status_death_circle.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜my_status_injury_circle.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜my_status_safe_circle.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜my_status_update.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜navigation_bottom.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜navi_click_color.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜no_connect_ble.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜radius.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜rounded_background_with_shadow.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜safe_radius_wrap.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜siren_image.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜streetmap.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜sub_background.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜switch_track_selector.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜switch_track_thumb.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜tab_background_selector.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜toolbar_alert.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜top_rounded_shape.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜tutorial_1.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜tutorial_2.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜tutorial_3.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜tutorial_4.png
 ┃ ┃ ┃ ┃ ┃ ┣ 📜tutorial_selector.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜tutorial_step_circle.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜tutorial_step_circle_main.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜white_background.xml
 ┃ ┃ ┃ ┃ ┣ 📂font
 ┃ ┃ ┃ ┃ ┃ ┣ 📜font_custom.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜spoqahansansneo_bold.ttf
 ┃ ┃ ┃ ┃ ┃ ┣ 📜spoqahansansneo_light.ttf
 ┃ ┃ ┃ ┃ ┃ ┣ 📜spoqahansansneo_medium.ttf
 ┃ ┃ ┃ ┃ ┃ ┣ 📜spoqahansansneo_regular.ttf
 ┃ ┃ ┃ ┃ ┃ ┣ 📜spoqahansansneo_thin.ttf
 ┃ ┃ ┃ ┃ ┃ ┗ 📜taebaek_milkyway.ttf
 ┃ ┃ ┃ ┃ ┣ 📂layout
 ┃ ┃ ┃ ┃ ┃ ┣ 📜activity_alarm.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜activity_chatting_detail.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜activity_choose_group_member.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜activity_enter_info.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜activity_loading.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜activity_main.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜activity_tutorial.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜chatting_toolbar.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜custom_toast.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜custom_toast_chat.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜custom_toast_map.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_blood_setting.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_calendar_setting.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_layout.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_mypage_layout.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dialog_siren_layout.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_alarm.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_ble.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_chatting.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_choose_group_member.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_emergency_info_dialog.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_family.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_family_add.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_family_alarm.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_family_place_add_edit.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_flashlight.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_group.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_group_chatting.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_home.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_main_around_advertise.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_main_around_list.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_main_family_around_list.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_main_mesh.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_map.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_maps.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_map_alarm.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_my_page.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_my_status.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_my_status_dialog.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_one_chatting.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_other_user_info.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜fragment_wifi_direct.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜group_item.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_alarm.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_around_advertise_list.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_around_list.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_category_facility.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_chatting.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_choose_group.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_detail_chatting.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_family.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_family_wait.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_flash.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_group_chatting.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_list_facility.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_map_facility.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_other_flash.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜item_self_flash.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜tutorial_item.xml
 ┃ ┃ ┃ ┃ ┣ 📂menu
 ┃ ┃ ┃ ┃ ┃ ┣ 📜bottom_navi_menu.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜toolbar_menu.xml
 ┃ ┃ ┃ ┃ ┣ 📂mipmap-anydpi-v26
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ic_launcher_round.xml
 ┃ ┃ ┃ ┃ ┣ 📂mipmap-hdpi
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher.webp
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.webp
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ic_launcher_round.webp
 ┃ ┃ ┃ ┃ ┣ 📂mipmap-mdpi
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher.webp
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.webp
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ic_launcher_round.webp
 ┃ ┃ ┃ ┃ ┣ 📂mipmap-xhdpi
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher.webp
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.webp
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ic_launcher_round.webp
 ┃ ┃ ┃ ┃ ┣ 📂mipmap-xxhdpi
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher.webp
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.webp
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ic_launcher_round.webp
 ┃ ┃ ┃ ┃ ┣ 📂mipmap-xxxhdpi
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher.webp
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher_foreground.webp
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ic_launcher_round.webp
 ┃ ┃ ┃ ┃ ┣ 📂navigation
 ┃ ┃ ┃ ┃ ┃ ┗ 📜nav_graph.xml
 ┃ ┃ ┃ ┃ ┣ 📂raw
 ┃ ┃ ┃ ┃ ┃ ┣ 📜bluetooth.json
 ┃ ┃ ┃ ┃ ┃ ┣ 📜connect_ble_lottie.json
 ┃ ┃ ┃ ┃ ┃ ┣ 📜korea_7_13.sqlite
 ┃ ┃ ┃ ┃ ┃ ┣ 📜offmapfacilitydata.csv
 ┃ ┃ ┃ ┃ ┃ ┣ 📜siren_sound.mp3
 ┃ ┃ ┃ ┃ ┃ ┣ 📜testfacilitydata.csv
 ┃ ┃ ┃ ┃ ┃ ┣ 📜toast_alarm.mp3
 ┃ ┃ ┃ ┃ ┃ ┣ 📜wifi.json
 ┃ ┃ ┃ ┃ ┃ ┣ 📜wifi2.json
 ┃ ┃ ┃ ┃ ┃ ┗ 📜wifii.json
 ┃ ┃ ┃ ┃ ┣ 📂values
 ┃ ┃ ┃ ┃ ┃ ┣ 📜colors.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜dimens.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜font_style.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜google_maps.api.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ic_launcher_background.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜strings.xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜styles.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜themes.xml
 ┃ ┃ ┃ ┃ ┣ 📂values-land
 ┃ ┃ ┃ ┃ ┃ ┗ 📜dimens.xml
 ┃ ┃ ┃ ┃ ┣ 📂values-night
 ┃ ┃ ┃ ┃ ┃ ┣ 📜colors.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜themes.xml
 ┃ ┃ ┃ ┃ ┣ 📂values-w1240dp
 ┃ ┃ ┃ ┃ ┃ ┗ 📜dimens.xml
 ┃ ┃ ┃ ┃ ┣ 📂values-w600dp
 ┃ ┃ ┃ ┃ ┃ ┗ 📜dimens.xml
 ┃ ┃ ┃ ┃ ┗ 📂xml
 ┃ ┃ ┃ ┃ ┃ ┣ 📜backup_rules.xml
 ┃ ┃ ┃ ┃ ┃ ┗ 📜data_extraction_rules.xml
 ┃ ┃ ┃ ┣ 📜AndroidManifest.xml
 ┃ ┃ ┃ ┗ 📜ic_launcher-playstore.png
 ┃ ┃ ┗ 📂test
 ┃ ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂saveurlife
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ExampleUnitTest.kt
 ┃ ┣ 📜.gitignore
 ┃ ┣ 📜build.gradle.kts
 ┃ ┗ 📜proguard-rules.pro
 ┣ 📂gradle
 ┃ ┗ 📂wrapper
 ┃ ┃ ┣ 📜gradle-wrapper.jar
 ┃ ┃ ┗ 📜gradle-wrapper.properties
 ┣ 📜.gitignore
 ┣ 📜build.gradle.kts
 ┣ 📜gradle.properties
 ┣ 📜gradlew
 ┣ 📜gradlew.bat
 ┗ 📜settings.gradle.kts
```
</details>
<details>
<summary>FE 폴더 구조</summary>

```Plain Text

📦FE-WEB
 ┗ 📂good-news
 ┃ ┣ 📂public
 ┃ ┃ ┣ 📂assets
 ┃ ┃ ┃ ┣ 📜goodNewsLogo.png
 ┃ ┃ ┃ ┣ 📜googlePlay.png
 ┃ ┃ ┃ ┣ 📜login.png
 ┃ ┃ ┃ ┣ 📜mainBackground.mp4
 ┃ ┃ ┃ ┣ 📜mainFlashLight.png
 ┃ ┃ ┃ ┣ 📜mainMap.png
 ┃ ┃ ┃ ┣ 📜mapAroundPerson.png
 ┃ ┃ ┃ ┣ 📜mapFamily.png
 ┃ ┃ ┃ ┣ 📜mapHospital.png
 ┃ ┃ ┃ ┣ 📜mapMart.png
 ┃ ┃ ┃ ┣ 📜mapPromise.png
 ┃ ┃ ┃ ┣ 📜mapShelter.png
 ┃ ┃ ┃ ┣ 📜qrcode.png
 ┃ ┃ ┃ ┣ 📜saveA.png
 ┃ ┃ ┃ ┣ 📜saveALong.png
 ┃ ┃ ┃ ┣ 📜saveAShort.png
 ┃ ┃ ┃ ┣ 📜saveE.png
 ┃ ┃ ┃ ┣ 📜saveEShort.png
 ┃ ┃ ┃ ┣ 📜saveS.png
 ┃ ┃ ┃ ┣ 📜saveSShort.png
 ┃ ┃ ┃ ┣ 📜saveV.png
 ┃ ┃ ┃ ┣ 📜saveVLong.png
 ┃ ┃ ┃ ┗ 📜saveVShort.png
 ┃ ┃ ┣ 📜favicon.ico
 ┃ ┃ ┣ 📜index.html
 ┃ ┃ ┣ 📜logo192.png
 ┃ ┃ ┣ 📜logo512.png
 ┃ ┃ ┣ 📜manifest.json
 ┃ ┃ ┗ 📜robots.txt
 ┃ ┣ 📂src
 ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┣ 📂constants
 ┃ ┃ ┃ ┃ ┗ 📜Routes.tsx
 ┃ ┃ ┃ ┗ 📂style
 ┃ ┃ ┃ ┃ ┗ 📜GlobalStyles.tsx
 ┃ ┃ ┣ 📂components
 ┃ ┃ ┃ ┣ 📂@common
 ┃ ┃ ┃ ┃ ┣ 📜Button.tsx
 ┃ ┃ ┃ ┃ ┣ 📜Card.tsx
 ┃ ┃ ┃ ┃ ┣ 📜Footer.tsx
 ┃ ┃ ┃ ┃ ┣ 📜Header.tsx
 ┃ ┃ ┃ ┃ ┣ 📜InputBox.tsx
 ┃ ┃ ┃ ┃ ┣ 📜SafeStatusBox.tsx
 ┃ ┃ ┃ ┃ ┣ 📜SelectBox.tsx
 ┃ ┃ ┃ ┃ ┣ 📜SpareStatusBox.tsx
 ┃ ┃ ┃ ┃ ┗ 📜Text.tsx
 ┃ ┃ ┃ ┣ 📂admin
 ┃ ┃ ┃ ┃ ┣ 📜AdminContentWrap.tsx
 ┃ ┃ ┃ ┃ ┣ 📜MapAdmin.tsx
 ┃ ┃ ┃ ┃ ┣ 📜MapAdminInfoBox.tsx
 ┃ ┃ ┃ ┃ ┣ 📜MapAdminInfoBoxList.tsx
 ┃ ┃ ┃ ┃ ┣ 📜ShelterBox.tsx
 ┃ ┃ ┃ ┃ ┗ 📜ShelterBoxList.tsx
 ┃ ┃ ┃ ┗ 📂home
 ┃ ┃ ┃ ┃ ┣ 📜DownloadIntro.tsx
 ┃ ┃ ┃ ┃ ┣ 📜IntroBox.tsx
 ┃ ┃ ┃ ┃ ┣ 📜IntroBoxList.tsx
 ┃ ┃ ┃ ┃ ┣ 📜MainIntro.tsx
 ┃ ┃ ┃ ┃ ┣ 📜MapIntro.tsx
 ┃ ┃ ┃ ┃ ┣ 📜SubIntro1.tsx
 ┃ ┃ ┃ ┃ ┣ 📜SubIntro2.tsx
 ┃ ┃ ┃ ┃ ┣ 📜SubIntro3.tsx
 ┃ ┃ ┃ ┃ ┗ 📜SubIntro4.tsx
 ┃ ┃ ┣ 📂pages
 ┃ ┃ ┃ ┣ 📜AdminPage.tsx
 ┃ ┃ ┃ ┣ 📜HomePage.tsx
 ┃ ┃ ┃ ┣ 📜LoginPage.tsx
 ┃ ┃ ┃ ┣ 📜NotFoundPage.tsx
 ┃ ┃ ┃ ┗ 📜Pages.tsx
 ┃ ┃ ┣ 📂types
 ┃ ┃ ┃ ┗ 📜react-fullpage.d.ts
 ┃ ┃ ┣ 📜App.css
 ┃ ┃ ┣ 📜App.test.tsx
 ┃ ┃ ┣ 📜App.tsx
 ┃ ┃ ┣ 📜index.css
 ┃ ┃ ┣ 📜index.tsx
 ┃ ┃ ┣ 📜logo.svg
 ┃ ┃ ┣ 📜react-app-env.d.ts
 ┃ ┃ ┣ 📜reportWebVitals.ts
 ┃ ┃ ┗ 📜setupTests.ts
 ┃ ┣ 📜.gitignore
 ┃ ┣ 📜package-lock.json
 ┃ ┣ 📜package.json
 ┃ ┣ 📜README.md
 ┃ ┣ 📜tailwind.config.js
 ┃ ┗ 📜tsconfig.json
```
</details>
<details>
<summary>BE 폴더 구조</summary>

  
```Plain Text
📦BE-WEB
 ┣ 📂discovery
 ┃ ┣ 📂gradle
 ┃ ┃ ┗ 📂wrapper
 ┃ ┃ ┃ ┣ 📜gradle-wrapper.jar
 ┃ ┃ ┃ ┗ 📜gradle-wrapper.properties
 ┃ ┣ 📂src
 ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂discovery
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DiscoveryApplication.java
 ┃ ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┃ ┗ 📂ssl
 ┃ ┃ ┃ ┃ ┃ ┗ 📜keystore.p12
 ┃ ┃ ┗ 📂test
 ┃ ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂discovery
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜DiscoveryApplicationTests.java
 ┃ ┣ 📜.gitignore
 ┃ ┣ 📜build.gradle
 ┃ ┣ 📜gradlew
 ┃ ┣ 📜gradlew.bat
 ┃ ┣ 📜keystore.p12
 ┃ ┗ 📜settings.gradle
 ┣ 📂gateway
 ┃ ┣ 📂gradle
 ┃ ┃ ┗ 📂wrapper
 ┃ ┃ ┃ ┣ 📜gradle-wrapper.jar
 ┃ ┃ ┃ ┗ 📜gradle-wrapper.properties
 ┃ ┣ 📂src
 ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂gateway
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂filter
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AuthorizationHeaderFilter.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜GatewayApplication.java
 ┃ ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┃ ┣ 📂ssl
 ┃ ┃ ┃ ┃ ┃ ┗ 📜keystore.p12
 ┃ ┃ ┃ ┃ ┣ 📜application-dev.yml
 ┃ ┃ ┃ ┃ ┗ 📜application-prd.yml
 ┃ ┃ ┗ 📂test
 ┃ ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂gateway
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜GatewayApplicationTests.java
 ┃ ┣ 📜.gitignore
 ┃ ┣ 📜build.gradle
 ┃ ┣ 📜gradlew
 ┃ ┣ 📜gradlew.bat
 ┃ ┗ 📜settings.gradle
 ┣ 📂map
 ┃ ┣ 📂gradle
 ┃ ┃ ┗ 📂wrapper
 ┃ ┃ ┃ ┣ 📜gradle-wrapper.jar
 ┃ ┃ ┃ ┗ 📜gradle-wrapper.properties
 ┃ ┣ 📂src
 ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂map
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MongoConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜StringToFacilityConverter.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SwaggerConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂exception
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂handler
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ControllerAdvice.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂message
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseErrorEnum.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapErrorEnum.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂validator
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseValidator.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapValidator.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CustomException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂map
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Facility.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OffMapInfo.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂request
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityDurationReqeustDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LocalPopulationDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapFacilityRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapPopulationRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapRegistFacilityRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂response
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityStateResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapPopulationResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapMongoRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂util
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ExceptionResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapApplication.java
 ┃ ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┃ ┣ 📜application-dev.properties
 ┃ ┃ ┃ ┃ ┣ 📜application-prd.properties
 ┃ ┃ ┃ ┃ ┗ 📜application.properties
 ┃ ┃ ┗ 📂test
 ┃ ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂map
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapApplicationTests.java
 ┃ ┣ 📜.gitignore
 ┃ ┣ 📜build.gradle
 ┃ ┣ 📜gradlew
 ┃ ┣ 📜gradlew.bat
 ┃ ┗ 📜settings.gradle
 ┗ 📂member
 ┃ ┣ 📂gradle
 ┃ ┃ ┗ 📂wrapper
 ┃ ┃ ┃ ┣ 📜gradle-wrapper.jar
 ┃ ┃ ┃ ┗ 📜gradle-wrapper.properties
 ┃ ┣ 📂src
 ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂member
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseConnectEntity.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseCreateEntity.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BaseEntity.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExceptionResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FileDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RefreshTokenResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TokenDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂exception
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂handler
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ControllerAdvice.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂message
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseErrorEnum.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityErrorEnum.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyErrorEnum.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberErrorEnum.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TokenErrorEnum.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂validator
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseValidator.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityValidator.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyValidator.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberValidator.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TokenValidator.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CustomException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂util
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂file
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜FileUploadUtil.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂property
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ApplicationProperties.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RedisProperties.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JpaConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RedisConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SwaggerConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WebConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂jwt
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜JwtTokenProvider.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂app
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberAppController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂web
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberWebController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityState.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Family.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyMember.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyPlace.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LocalPopulation.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Member.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Role.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂request
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂facility
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityDurationReqeustDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LocalPopulationDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapFacilityRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MapPopulationRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapRegistFacilityRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂family
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyPlaceCanuseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyPlaceRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyPlaceUpdateRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyRegistPlaceRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜FamilyRegistRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂member
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberFirstLoginRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberInfoUpdateRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberLoginAdminRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberPhoneRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberRegistFamilyRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberRegistRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberStateRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberUpdateDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂response
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂facility
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityStateResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MapPopulationResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂family
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyInviteResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyPlaceDetailResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyPlaceInfoResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜FamilyRegistPlaceResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂member
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberFamilyListResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberFirstLoginResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberInfoResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberRegistFamilyResposneDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberResponseDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂querydsl
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberQueryDslRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityStateRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyMemberRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyPlaceRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LocalPopulationRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FacilityService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FamilyService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberApplication.java
 ┃ ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┃ ┣ 📂ssl
 ┃ ┃ ┃ ┃ ┃ ┗ 📜keystore.p12
 ┃ ┃ ┃ ┃ ┣ 📜application-dev.properties
 ┃ ┃ ┃ ┃ ┣ 📜application-prd.properties
 ┃ ┃ ┃ ┃ ┗ 📜application.properties
 ┃ ┃ ┗ 📂test
 ┃ ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┃ ┗ 📂goodnews
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂member
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜GoodnewsApplicationTests.java
 ┃ ┣ 📜.gitignore
 ┃ ┣ 📜build.gradle
 ┃ ┣ 📜gradlew
 ┃ ┣ 📜gradlew.bat
 ┃ ┗ 📜settings.gradle
```
</details>

<br />


## 기술 스택

| FrontEnd                | BackEnd            | Android            | DB           | CI/CD                     | 협업툴  |
| ----------------------- | ------------------ | --------------- | ------------ | ------------------------- | ------- |
| Node 18.16.1            | Java JDK 11        | CompileSDK 34   | MySQL 8.0.33 | AWS EC2(Ubuntu 20.04 LTS) | GitLab  |
| NPM 9.6.7               | Spring Boot 2.7.17 | TargetSDK  33   | Redis 7.0.12 | Nginx 1.25.1              | Jira    |
| Typescript + TailWindCss| Gradle 8.3         | MinSDK 30       | MongoDB 7.0.2| Docker 24                 | Notion  |
| React 18.2.0            | Lombok             | Java 8          |              | Jenkins                   | figma   |
| Recoil                  | Spring Security    | Realm           |              |                           | Swagger |
| React-query             | JJWT 0.9.1         |                 |              |                           | Postman |



<br>

## 시스템 아키텍처

<div align="center">
  <br />
  <img src="./img/시스템아키텍처.png" width="80%"/>
  <br />
</div>

<br/>

# 📚 프로젝트 기능

### 1. 메인화면




## 📝 프로젝트 산출물
- [개발환경](https://wandering-swan-9fa.notion.site/43a462ff4347423ea785941502ca333a?pvs=4)
- [요구사항 명세서](https://wandering-swan-9fa.notion.site/e83234e536a3495594dd912e9fc82147?pvs=4)
- [앱 erd](./img/app_erd.png)
- [웹 erd](./img/wep_erd.png)
- [api 연동 규격서](https://wandering-swan-9fa.notion.site/API-523be369856b4bbfb9a425ba2a324633?pvs=4)
- [포팅메뉴얼](./exec/희소식%20포팅매뉴얼.pdf)
- [발표 자료](./exec/희소식%20최종발표.pdf)
