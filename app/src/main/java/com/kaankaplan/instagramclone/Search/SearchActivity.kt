package com.kaankaplan.instagramclone.Search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaankaplan.instagramclone.R
import com.kaankaplan.instagramclone.utils.BottomNavViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class SearchActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 1
    private val TAG = "SearchActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavView()
    }

    fun setupNavView(){

        BottomNavViewHelper.setupBottomNavView(bottomNavigationView2)
        BottomNavViewHelper.setupNavigation(this,bottomNavigationView2)
        var menu = bottomNavigationView2.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }
}