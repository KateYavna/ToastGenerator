package com.example.toastgenerator

import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class PagerAdapter (val pages: ArrayList<Page>,fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager)

 {
    override fun getCount(): Int {
        return pages.size
    }

    override fun getItem(position: Int): Fragment {
        if (position ==2) return PagerSecondFragment.newInstance(pages[position].text,pages[position].photo)
        else return PagerFragment.newInstance(pages[position].text,pages[position].photo)
    }
}

