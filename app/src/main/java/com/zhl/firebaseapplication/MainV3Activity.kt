package com.zhl.firebaseapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase

class MainV3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Firebase.crashlytics.setUserId("123456")

    }

    override fun onStart() {
        super.onStart()
        val btnThrowException = findViewById<Button>(R.id.btnThrowException)
        btnThrowException.setOnClickListener {
            throw NullPointerException("v3发生异常了,closed2222")
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "toast message", Toast.LENGTH_SHORT).show()
            val params = Bundle()
            params.putString("testParams", "testValue")
//            params.putDouble(FirebaseAnalytics.Param.VALUE, 666.0)
//            params.putString(FirebaseAnalytics.Param.CURRENCY, "USD")
//            FirebaseAnalytics.getInstance(this).logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, params)
        }
    }

}