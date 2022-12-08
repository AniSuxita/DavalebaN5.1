package com.example.davaleban5

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.davaleban5.adapter.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager2: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2 = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        viewPager2.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabLayout, viewPager2) {tab,position->
            when (position) {
                0 -> tab.text = "Notes"
                1 -> tab.text = "Master"
                2 -> tab.text = "Game"
            }
        }.attach()


    }
}