package com.kaankaplan.instagramclone.utils

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.kaankaplan.instagramclone.Home.MainActivity
import com.kaankaplan.instagramclone.News.NewsActivity
import com.kaankaplan.instagramclone.Profile.ProfileActivity
import com.kaankaplan.instagramclone.Search.SearchActivity
import com.kaankaplan.instagramclone.Share.ShareActivity

class BottomNavViewHelper {

    companion object{

        fun setupBottomNavView(bottomNavViewEx: BottomNavigationViewEx){

            bottomNavViewEx.enableAnimation(false)
            bottomNavViewEx.enableShiftingMode(false)
            bottomNavViewEx.enableItemShiftingMode(false)
            bottomNavViewEx.setTextVisibility(false)


        }

        fun setupNavigation(context: Context, bottomNavViewEx: BottomNavigationViewEx){

            bottomNavViewEx.onNavigationItemSelectedListener=object : BottomNavigationView.OnNavigationItemSelectedListener{
                override fun onNavigationItemSelected(item: MenuItem): Boolean {
                    when (item.itemId) {
                        com.kaankaplan.instagramclone.R.id.ic_home -> {
                            val intent = Intent(context, MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true


                        }

                        com.kaankaplan.instagramclone.R.id.ic_search -> {
                            val intent = Intent(context, SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true


                        }

                        com.kaankaplan.instagramclone.R.id.ic_addphoto -> {
                            val intent = Intent(context, ShareActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true


                        }

                        com.kaankaplan.instagramclone.R.id.ic_likes -> {
                            val intent = Intent(context, NewsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true


                        }

                        com.kaankaplan.instagramclone.R.id.ic_profile -> {
                            val intent = Intent(context, ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                    }
                    return false
                }
            }
        }
    }
}