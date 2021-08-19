package com.zhl.firebaseapplication

import androidx.multidex.MultiDexApplication
import com.zhl.libfirebase.FirebaseUtil

/**
 *    author : zhuhl
 *    date   : 2021/8/3
 *    desc   :
 *    refer  :
 */
class MyApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        FirebaseUtil.init(null, !BuildConfig.DEBUG)
    }
}