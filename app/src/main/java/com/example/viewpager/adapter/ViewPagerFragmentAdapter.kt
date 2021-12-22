package com.example.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.fragments.FragmentFirst
import com.example.viewpager.fragments.FragmentNote
import com.example.viewpager.fragments.FragmentSecond

class ViewPagerFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() = 3



    override fun createFragment(position: Int): Fragment {
        return when (position){
            0->FragmentNote()
            1->FragmentFirst()
            2->FragmentSecond()
            else -> FragmentFirst()
        }
    }
}