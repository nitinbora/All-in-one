package com.example.shopping

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
//import com.example.getActivity.MainActivity

class adapter(private val myContext: slider, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                return fragment1()
            }
            1 -> {
                return fragment2()
            }
            2 -> {
                return games()
            }

            else -> return fragment2()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return 3
    }
}

class adapter2(private val myContext: web, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                return fragment1()
            }
            1 -> {
                return fragment2()
            }
            2 -> {
                return games()
            }

            else -> return fragment2()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return 3
    }
}