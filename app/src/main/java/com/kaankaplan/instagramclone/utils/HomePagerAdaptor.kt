package com.kaankaplan.instagramclone.utils

import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomePagerAdaptor(manager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(manager,lifecycle) {
    private var mFragmentList : ArrayList<Fragment> = ArrayList()


    override fun getItemCount(): Int {
        return  mFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return mFragmentList.get(position)
    }

    fun addFragment(fragment: Fragment){
        mFragmentList.add(fragment)
    }


}