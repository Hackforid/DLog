package com.smilehacker.ex.dlog

open class BaseAndroidLogger: BaseLogger() {

    private val mAndroidLogger by lazy { AndroidLogger() }

    override fun getLogger(): ILogger {
        return mAndroidLogger
    }

}