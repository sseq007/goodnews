package com.saveurlife.goodnews.family

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saveurlife.goodnews.R
import com.saveurlife.goodnews.databinding.FragmentFamilyBinding
import com.saveurlife.goodnews.flashlight.FlashType
import com.saveurlife.goodnews.flashlight.FlashlightData

class FamilyFragment : Fragment() {
    enum class Mode { ADD, READ, EDIT }

    private lateinit var familyListRecyclerView: RecyclerView
    private lateinit var binding: FragmentFamilyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFamilyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 첫 번째 모임 장소 layout 클릭 했을 때
        binding.meetingPlaceFirst.setOnClickListener {
            val placeId = 1 // 장소 id
            showMeetingDialog(placeId)
        }

        // 가족 신청 버튼을 클릭 했을 때
        binding.familyAddButton.setOnClickListener {
            showAddDialog()
        }

        var testData = listOf(
            FamilyData("김싸피", Status.HEALTHY, "2023-10-31 14:00:00"),
            FamilyData("이싸피", Status.INJURED, "2023-10-31 13:00:00"),
            FamilyData("싸피이", Status.DECEASED, "2023-10-30 15:00:00"),
            FamilyData("싸피싸피", Status.NOT_SHOWN, "2023-10-29 10:00:00")
        )

        familyListRecyclerView = view.findViewById(R.id.familyList)
        familyListRecyclerView.layoutManager = LinearLayoutManager(context)

        val adapter = FamilyListAdapter(testData)
        familyListRecyclerView.adapter = adapter
    }

    // 모달 창 띄워주는 것
    private fun showMeetingDialog(placeId: Int? = null) {
        val dialogFragment = FamilyPlaceAddEditFragment().apply {
//            arguments = Bundle().apply {
//                //데이터가 있으면 읽기 모드, 없으면 추가 모드
//                putSerializable("mode", if (placeId == null) Mode.ADD else Mode.READ)
//                putInt("placeId", placeId ?: -1)
//            }
        }
        dialogFragment.show(childFragmentManager, "FamilyPlaceAddEditFragment")
    }

    private fun showAddDialog() {
        val dialogFragment = FamilyAddFragment()
        dialogFragment.show(childFragmentManager, "FamilyAddFragment")
    }
}