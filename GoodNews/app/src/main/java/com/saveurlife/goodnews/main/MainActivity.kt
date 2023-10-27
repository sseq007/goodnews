package com.saveurlife.goodnews.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.saveurlife.goodnews.R
import com.saveurlife.goodnews.common.FamilyFragment
import com.saveurlife.goodnews.common.HomeFragment
import com.saveurlife.goodnews.common.MapFragment
import com.saveurlife.goodnews.common.MyPageFragment
import com.saveurlife.goodnews.databinding.ActivityMainBinding
import com.saveurlife.goodnews.tutorial.TutorialActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG_HOME = "home_fragment"
    private val TAG_MAP = "map_fragment"
    private val TAG_FAMILY = "family_fragment"
    private val TAG_MY_PAGE = "my_page_fragment"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //가족 등록 모달창
        val dialog = FamilyAlarmFragment()
        dialog.show(supportFragmentManager, "FamilyAlarmFragment")

        //상단바 모달창
        setSupportActionBar(binding.toolbar)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.mapFragment,
                R.id.familyFragment,
                R.id.myPageFragment,
                R.id.flashLightFragment
            )
        )
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)

        binding.navigationView.setupWithNavController(navController)

        //상태 변경
//        binding.myStatusUpdateButtom.setOnClickListener{
//
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

}