package com.example.davaleban5.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.davaleban5.fragments.FirstFragment
import com.example.davaleban5.fragments.SecondFragment
import com.example.davaleban5.fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {


        return when (position) {
            0 -> {
                FirstFragment()
            }
            1 -> {
                SecondFragment()
            }
            else -> {
                ThirdFragment()
            }
        }

    }
}