package com.kaankaplan.instagramclone.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaankaplan.instagramclone.R
import com.kaankaplan.instagramclone.utils.BottomNavViewHelper
import com.kaankaplan.instagramclone.utils.HomePagerAdaptor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 0
    private val TAG = "HomeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavView()

        setupHomeViewPager()
    }



    fun setupNavView(){

        BottomNavViewHelper.setupBottomNavView(bottomNavigationView2)
        BottomNavViewHelper.setupNavigation(this,bottomNavigationView2)
        var menu = bottomNavigationView2.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }

    private fun setupHomeViewPager() {
        var homePagerAdaptor = HomePagerAdaptor(supportFragmentManager,lifecycle)
        homePagerAdaptor.addFragment(CameraFragment()) // id=0
        homePagerAdaptor.addFragment(HomeFragment())
        homePagerAdaptor.addFragment(DirectMassageFragment())

        homeViewPager.adapter = homePagerAdaptor

        homeViewPager.setCurrentItem(1)
    }
}