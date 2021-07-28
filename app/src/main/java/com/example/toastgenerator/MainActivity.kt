package com.example.toastgenerator

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_pager.*
import kotlinx.android.synthetic.main.fragment_pager_second.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pages : ArrayList<Page> = arrayListOf(
            Page(resources.getString(R.string.first_page),BitmapFactory.decodeResource(resources,R.drawable.sherlok1)),
            Page(resources.getString(R.string.second_page),BitmapFactory.decodeResource(resources,R.drawable.sherlok4)),
            Page(resources.getString(R.string.third_page),BitmapFactory.decodeResource(resources,R.drawable.sherlok2))
        )

        vpViewPager.adapter = PagerAdapter(pages,supportFragmentManager)

        }

    }


