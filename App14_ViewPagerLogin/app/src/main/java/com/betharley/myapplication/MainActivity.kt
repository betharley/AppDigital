package com.betharley.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.betharley.myapplication.fragments.SignUpFragment
import com.betharley.myapplication.fragments.SingInFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.viewPager)
        val tab = findViewById<TabLayout>(R.id.tableLayout)

        tab.setupWithViewPager(pager)


       val fragments = listOf(
               SingInFragment(), SignUpFragment()
        )

        val titulos = listOf(
                getString(R.string.singIn), getString(R.string.signUp)
        )
        pager.adapter = ViewPagerAdapter( fragments, titulos, supportFragmentManager)



    }
}