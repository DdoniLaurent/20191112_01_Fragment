package com.tioeun.a20191112_01_fragment

import android.os.Bundle
import android.os.PersistableBundle
import com.tioeun.a20191112_01_fragment.adapter.TestViewPagerAdapter
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        testViewPager.adapter = TestViewPagerAdapter(supportFragmentManager)

        myTabLayout.setupWithViewPager(testViewPager)
    }
}
