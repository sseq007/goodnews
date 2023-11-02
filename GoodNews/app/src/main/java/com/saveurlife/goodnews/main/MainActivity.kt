package com.saveurlife.goodnews.main

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Layer
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.saveurlife.goodnews.R
import com.saveurlife.goodnews.alarm.AlarmActivity
import com.saveurlife.goodnews.databinding.ActivityMainBinding
import com.saveurlife.goodnews.flashlight.FlashlightFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val navController by lazy {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navHostFragment.navController
    }

    // MediaPlayer 객체를 클래스 레벨 변수로 선언
    private var mediaPlayer: MediaPlayer? = null
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //가족 등록 모달창
        val dialog = FamilyAlarmFragment()
        dialog.show(supportFragmentManager, "FamilyAlarmFragment")

        //상단바 toolbar
        setSupportActionBar(binding.toolbar)

        //Fragment 갈아 끼우기
        binding.navigationView.background = null
        binding.navigationView.menu.getItem(2).isEnabled = false

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.mapFragment,
                R.id.familyFragment,
                R.id.myPageFragment,
                R.id.flashlightFragment
            )
        )
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)

        // 왜 안 되지... @@ 수정
        // binding.navigationView.setupWithNavController(navController)
        binding.navigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.homeFragment, R.id.mapFragment, R.id.familyFragment, R.id.myPageFragment -> {
                    navController.navigateSingleTop(menuItem.itemId)
                    true
                }

                else -> false
                }
            }
            // 원래의 selector 다시 적용
            navController.addOnDestinationChangedListener { _, _, _ ->
                val originalSelector =
                    ContextCompat.getColorStateList(this, R.drawable.menu_selector)
                binding.navigationView.itemTextColor = originalSelector
                binding.navigationView.itemIconTintList = originalSelector
            }

            // 알림창 갔다가 다시 돌아올 때 toolbar, navigationBottom 원래대로 표시
            supportFragmentManager.addOnBackStackChangedListener {
                // 프래그먼트 스택에 프래그먼트가 없을 때 Toolbar와 BottomNavigationView 표시
                if (supportFragmentManager.backStackEntryCount == 0) {
                    binding.toolbar.visibility = View.VISIBLE
                    binding.navigationView.visibility = View.VISIBLE
                    binding.bottomAppBar.visibility = View.VISIBLE
                    binding.mainCircleAddButton.visibility = View.VISIBLE
                }
            }

            binding.mainCircleAddButton.setOnClickListener {
                showDialog()
                val inactiveGrayColor = ContextCompat.getColor(this, R.color.inactive_gray)
                val colorStateList = ColorStateList.valueOf(inactiveGrayColor)
                val navigationView: BottomNavigationView = findViewById(R.id.navigationView)

                // 생성한 ColorStateList를 BottomNavigationView에 적용
                navigationView.itemTextColor = colorStateList
                navigationView.itemIconTintList = colorStateList
            }

    }


    //Dialog fragment 모달창
    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setGravity(Gravity.BOTTOM)
        dialog.setContentView(R.layout.dialog_layout) // dialog_layout는 표시하고자 하는 다이얼로그의 레이아웃 이름입니다.


        // 필요한 경우 다이얼로그의 버튼 또는 다른 뷰에 대한 이벤트 리스너를 여기에 추가합니다.
        val view = dialog.window?.decorView

        // 투명도 애니메이션 설정
        val alphaAnimation = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        alphaAnimation.duration = 300

        // 크기 애니메이션 설정
        val scaleXAnimation = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f)
        scaleXAnimation.duration = 300
        val scaleYAnimation = ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f)
        scaleYAnimation.duration = 300


        // 애니메이션 세트를 생성하고 시작
        val animatorSet = AnimatorSet()
        animatorSet.playTogether(alphaAnimation, scaleXAnimation, scaleYAnimation)
        animatorSet.start()

        //경보음
        val soundLayer = dialog.findViewById<View>(R.id.soundLayer)
        soundLayer.setOnClickListener {
            // 두 번째 다이얼로그 표시 함수 호출
            showSecondDialog()
            dialog.dismiss()
        }



        val navController = findNavController(R.id.nav_host_fragment)
        val flashLayer = dialog.findViewById<Layer>(R.id.flashLayer)
        flashLayer?.setOnClickListener {
            navController.navigate(R.id.flashlightFragment)
            dialog.dismiss()
        }

        dialog.show()
    }

    //toolbar 보여주기
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_search -> {
                val intent = Intent(this, AlarmActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                return true
            }

            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
    private fun showSecondDialog() {
        val secondDialog = Dialog(this)
        secondDialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        secondDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        secondDialog.setCancelable(true)
        secondDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        secondDialog.window?.setGravity(Gravity.CENTER)
        secondDialog.setContentView(R.layout.siren_layout)

        // 필요한 경우 두 번째 다이얼로그의 버튼 또는 다른 뷰에 대한 이벤트 리스너를 여기에 추가합니다.
        val sirenStartButton = secondDialog.findViewById<Button>(R.id.sirenStartButton)
        val sirenStartTextView = secondDialog.findViewById<TextView>(R.id.sirenStartTextView)
        val sirenStopButton = secondDialog.findViewById<Button>(R.id.sirenStopButton)
        val sirenStopTextView = secondDialog.findViewById<TextView>(R.id.sirenStopTextView)

        sirenStartButton.setOnClickListener {
            sirenStartButton.visibility = View.GONE
            sirenStartTextView.visibility = View.GONE
            sirenStopButton.visibility = View.VISIBLE
            sirenStopTextView.visibility = View.VISIBLE
            playSound(R.raw.siren_sound, sirenStartButton, sirenStartTextView, sirenStopButton, sirenStopTextView)
        }

        sirenStopButton.setOnClickListener {
            stopSound()
            sirenStartButton.visibility = View.VISIBLE
            sirenStartTextView.visibility = View.VISIBLE
            sirenStopButton.visibility = View.GONE
            sirenStopTextView.visibility = View.GONE
        }

        secondDialog.setOnDismissListener {
            stopSound()
        }

        secondDialog.show()
    }

    //경보음 멈추기
    private fun stopSound() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    //경보음 재생하기
    private fun playSound(
        sirenSound: Int,
        sirenStartButton: Button,
        sirenStartTextView: TextView,
        sirenStopButton: Button,
        sirenStopTextView: TextView
    ) {
        mediaPlayer?.stop()
        mediaPlayer?.release()

        mediaPlayer = MediaPlayer.create(this, sirenSound)
        mediaPlayer?.start()

        // 소리 재생이 끝나면 자원 해제
        mediaPlayer?.setOnCompletionListener {
            it.release()
            mediaPlayer = null
            sirenStartButton.visibility = View.VISIBLE
            sirenStartTextView.visibility = View.VISIBLE
            sirenStopButton.visibility = View.GONE
            sirenStopTextView.visibility = View.GONE
        }
    }

}

fun NavController.navigateSingleTop(id: Int) {
    if (currentDestination?.id != id) {
        navigate(id)
    }
}