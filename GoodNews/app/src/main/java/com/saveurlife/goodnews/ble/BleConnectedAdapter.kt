package com.saveurlife.goodnews.ble

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saveurlife.goodnews.R
import com.saveurlife.goodnews.databinding.ItemAroundListBinding
import kotlin.math.abs
import kotlin.math.asin
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

class BleConnectedAdapter(private val userList: List<BleMeshConnectedUser>) : RecyclerView.Adapter<BleConnectedAdapter.UserViewHolder>() {

    //뷰 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemAroundListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    //데이터 바인딩
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user)
    }

    //리스트의 크기만큼 반환
    override fun getItemCount() = userList.size

    class UserViewHolder(private val binding: ItemAroundListBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: BleMeshConnectedUser) {
            // itemView에서 뷰 요소에 접근하여 데이터 설정
            binding.aroundName.text = user.userName
            updateHealthStatusBackground(user.healthStatus)
//            var currentLat = 36.355015
//            var currentLon = 127.299853
            var currentLat = 36.36190327
            var currentLon = 127.34528927
            val distance = calculateDistance(currentLat, currentLon, user.lat, user.lon)
            binding.aroundBetween.text = "약 ${distance.toInt()}m"
        }

        //상태(숫자)에 따라 색 변경
        private fun updateHealthStatusBackground(healthStatus: String) {
            when (healthStatus) {
                "1" ->  this.binding.aroundStatus.setBackgroundResource(R.drawable.my_status_safe_circle)
                "2" ->  this.binding.aroundStatus.setBackgroundResource(R.drawable.my_status_injury_circle)
                "3" ->  this.binding.aroundStatus.setBackgroundResource(R.drawable.my_status_death_circle)
                "4" ->  this.binding.aroundStatus.setBackgroundResource(R.drawable.my_status_circle)
                else ->  this.binding.aroundStatus.setBackgroundResource(R.drawable.my_status_circle)
            }
        }
//        private fun calculateDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
//            val earthRadius = 6371000.0 // 지구 반지름 (미터 단위)
//
//            val dLat = Math.toRadians(lat2 - lat1)
//            val dLon = Math.toRadians(lon2 - lon1)
//            println("위도 경도 차이 : $dLat , $dLon")
//
//            val a = sin(dLat / 2).pow(2) + cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2)) * sin(dLon / 2).pow(2)
//            println("a의 값은 ?? $a")
//            val c = 2 * atan2(sqrt(a), sqrt(1 - a))
//            println("c의 값은 ?? $c")
//            println("리턴 값은 ? ${earthRadius*c}")
//
//            return earthRadius * c
//        }
        
        //하버사인 공식
        private fun calculateDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
            val distance: Double
            val radius = 6371000.0 // 지구 반지름(km)
            val toRadian = Math.PI / 180
            val deltaLatitude = abs(x1 - x2) * toRadian
            val deltaLongitude = abs(y1 - y2) * toRadian
            val sinDeltaLat = sin(deltaLatitude / 2)
            val sinDeltaLng = sin(deltaLongitude / 2)
            val squareRoot = sqrt(
                sinDeltaLat * sinDeltaLat +
                        cos(x1 * toRadian) * cos(x2 * toRadian) * sinDeltaLng * sinDeltaLng
            )
            distance = 2 * radius * asin(squareRoot)
            return distance
        }
    }

}