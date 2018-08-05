package com.smilehacker.dlog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.smilehacker.ex.dlog.BaseAndroidLogger
import com.smilehacker.ex.dlog.DLog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DLog.i("hello")
        AppLog.d("world")
    }
}

object AppLog: BaseAndroidLogger() {
    init {
        showCallerInMessage = true
    }
    override fun getTag(): String {
        return "aaaa"
    }
}
