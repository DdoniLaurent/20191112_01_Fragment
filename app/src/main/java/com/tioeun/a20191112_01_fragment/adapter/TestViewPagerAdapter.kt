package com.tioeun.a20191112_01_fragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tioeun.a20191112_01_fragment.fragments.FirstFragment
import com.tioeun.a20191112_01_fragment.fragments.SecondFragment

class TestViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm){

//    각 위치에 어떤 Fragment를 보여줄건지
    override fun getItem(position: Int): Fragment {
//        if(position == 0) {
//            return FirstFragment()
//        } else {
//            return SecondFragment()
//        }
        return when(position){
            0 -> {
                FirstFragment()
            } else -> {
                SecondFragment()
            }
        }
    }

//    몇 개의 페이지를 운영할건지
    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> {
                "첫 탭"
            } else -> {
                "두번째 탭"
            }
        }
    }
}