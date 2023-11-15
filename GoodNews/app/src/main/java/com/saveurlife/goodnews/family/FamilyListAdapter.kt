package com.saveurlife.goodnews.family

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.saveurlife.goodnews.R
import com.saveurlife.goodnews.api.FamilyAPI
import com.saveurlife.goodnews.api.WaitInfo
import com.saveurlife.goodnews.models.FamilyMemInfo
import io.realm.kotlin.ext.query
import io.realm.kotlin.types.RealmInstant

class FamilyListAdapter() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    companion object{
        const val TYPE_WAIT = 1
        const val TYPE_ACCEPT = 2
        private var familyList: MutableList<FamilyData> = mutableListOf()
        private val familyAPI = FamilyAPI()
    }


    // 뷰홀더 두개 필요
    class AcceptViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameView: TextView = view.findViewById(R.id.familyNameTextView)
        val statusView: View = view.findViewById(R.id.familyStatusCircle)
        val lastAccessTimeView: TextView = view.findViewById(R.id.familyLastAccessTime)
    }
    class WaitViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameView: TextView = view.findViewById(R.id.WaitNameTextView)
        val acceptBtn: TextView = view.findViewById(R.id.acceptButton)
        val rejectBtn: TextView = view.findViewById(R.id.rejectButton)

        init {
            acceptBtn.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = familyList[position]
                    // 서버 요청
                    familyAPI.updateRegistFamily(item.acceptNumber, false)
                    FamilyFragment.familyListAdapter.addList()
                    // realm 저장 -> 해당 사람 요청
                }
            }
            rejectBtn.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = familyList[position]
                    // 서버 요청
                    familyAPI.updateRegistFamily(item.acceptNumber, true)
                    FamilyFragment.familyListAdapter.addList()
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (familyList[position].type) {
            FamilyType.ACCEPT -> TYPE_ACCEPT
            FamilyType.WAIT -> TYPE_WAIT
            else -> throw IllegalArgumentException("Unknown FamilyType in getItemViewType")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_ACCEPT -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_family, parent, false)
                AcceptViewHolder(view)
            }
            TYPE_WAIT -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_family_wait, parent, false)
                WaitViewHolder(view)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun getItemCount(): Int {
        return familyList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = familyList[position]


        when (item.type) {
            FamilyType.ACCEPT -> {
                val acceptViewHolder = holder as AcceptViewHolder

                acceptViewHolder.nameView.text = item.name
                acceptViewHolder.lastAccessTimeView.text = item.lastAccessTime.toString()

                when (item.status) {
                    Status.HEALTHY -> {
                        acceptViewHolder.statusView.backgroundTintList =
                            ContextCompat.getColorStateList(acceptViewHolder.itemView.context, R.color.safe)
                    }

                    Status.INJURED -> {
                        acceptViewHolder.statusView.backgroundTintList =
                            ContextCompat.getColorStateList(acceptViewHolder.itemView.context, R.color.caution)
                    }

                    Status.DECEASED -> {
                        acceptViewHolder.statusView.backgroundTintList =
                            ContextCompat.getColorStateList(acceptViewHolder.itemView.context, R.color.black)
                    }

                    else -> {
                        acceptViewHolder.statusView.backgroundTintList = null
                    }
                }
            }

            FamilyType.WAIT -> {
                val waitViewHolder = holder as WaitViewHolder
                waitViewHolder.nameView.text = item.name
            }
        }
    }

    fun addFamilyWait(name:String, acceptNumber:Int){
        familyList.add(FamilyData(name,Status.NOT_SHOWN,null ,FamilyType.WAIT, acceptNumber))
        notifyItemInserted(familyList.size)
    }
    fun addFamilyInfo(name:String, status: Status, lastAccessTime: RealmInstant?){
        familyList.add(FamilyData(name, status, lastAccessTime, FamilyType.ACCEPT))
        notifyItemInserted(familyList.size)
    }
    fun resetFamilyList(){
        familyList = mutableListOf()

    }

    fun addList(){
        // 서버에서 리스트 가져와서 추가
        familyAPI.getRegistFamily(FamilyFragment.memberId, object : FamilyAPI.WaitListCallback {
            override fun onSuccess(result: ArrayList<WaitInfo>) {
                result.forEach{
                    addFamilyWait(it.name, it.id)
                }
            }

            override fun onFailure(error: String) {
                // 실패 시의 처리
                Log.d("Family", "Registration failed: $error")
            }
        })

        val resultRealm = FamilyFragment.realm.query<FamilyMemInfo>().find()

        // 페이지 오면 기존 realm에꺼 추가
        if (resultRealm != null) {
            resultRealm.forEach {
                FamilyFragment.numToStatus[it.state.toInt()]?.let { it1 ->
                    addFamilyInfo(
                        it.name,
                        it1, it.lastConnection
                    )
                }
            }
        }
    }
}
