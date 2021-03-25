package com.module_camera

import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavCallback
import com.base.common.base.BaseActivity
import com.base.common.util.launchARouter
import com.base.common.util.normalNavigation

class MainActivity : BaseActivity() {
    override fun getContentView() = R.layout.activity_main

    override fun initView() {
    }

    override fun initData() {
        launchARouter("/camera/camera_home").normalNavigation(this, navCallback = object : NavCallback() {
            override fun onArrival(postcard: Postcard?) {
                finish()
            }
        })
    }
}