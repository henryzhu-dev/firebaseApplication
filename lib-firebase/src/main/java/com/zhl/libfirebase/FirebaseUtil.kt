package com.zhl.libfirebase

import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase

/**
 *    author : zhuhl
 *    date   : 2021/8/11
 *    desc   : firebase analytics使用示例，以下列出了集中事件统计的API使用，可参照直接在代码中引用
 *    refer  :
 */
object FirebaseUtil {

    fun setUserProperty(propertyName: String, propertyValue: String) {
        Firebase.analytics.setUserProperty(propertyName, propertyValue)
    }


    fun logEvent1() {
        /*
        Firebase.analytics.logEvent(name) {
            param("image_name", name)
            param("full_text", text)
        }

         */
    }

    fun logEvent2() {
        /*
        Firebase.analytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
            param(FirebaseAnalytics.Param.ITEM_ID, id)
            param(FirebaseAnalytics.Param.ITEM_NAME, name)
            param(FirebaseAnalytics.Param.CONTENT_TYPE, "image")
        }

         */
    }

    fun logEvent3() {
        /*
        Firebase.analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW) {
            param(FirebaseAnalytics.Param.SCREEN_NAME, screenName)
            param(FirebaseAnalytics.Param.SCREEN_CLASS, "MainActivity")
        }

         */
    }

    fun logEvent4() {
        /*
        val params = Bundle()
        params.putString("uid", uid)
        params.putDouble(FirebaseAnalytics.Param.VALUE, amount)
        params.putString(FirebaseAnalytics.Param.CURRENCY, "USD")
        params.putString("order_id", orderid)
        Firebase.analytics.logEvent("purchase", params)

         */
    }

    fun logEventJava() {
        /*
        val params = Bundle()
        params.putString("uid", uid)
        params.putDouble(FirebaseAnalytics.Param.VALUE, amount)
        params.putString(FirebaseAnalytics.Param.CURRENCY, "USD")
        params.putString("order_id", orderid)
        FirebaseAnalytics.getInstance(context).logEvent("purchase", params)

         */
    }


    /**
     * 设置用户id,可在崩溃信息中看到用户id
     */
    fun setUserId(userId: String) {
        Firebase.crashlytics.setUserId(userId)
    }

    /**
     * 开启崩溃日志上送，可只在release版打开
     */
    fun setCrashlyticsCollectionEnabled(enabled: Boolean) {
        Firebase.crashlytics.setCrashlyticsCollectionEnabled(enabled)
    }


    fun init(userId: String?, enabled: Boolean) {
        if (!userId.isNullOrEmpty()) {
            setUserId(userId)
        }
        setCrashlyticsCollectionEnabled(enabled)
    }
}