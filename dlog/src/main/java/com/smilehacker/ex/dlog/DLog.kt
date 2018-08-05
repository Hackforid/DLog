package com.smilehacker.ex.dlog

object DLog: ITaggedLogger {
    /**
     * Priority constant for the println method; use Log.v.
     */
    const val VERBOSE = 2

    /**
     * Priority constant for the println method; use Log.d.
     */
    const val DEBUG = 3

    /**
     * Priority constant for the println method; use Log.i.
     */
    const val INFO = 4

    /**
     * Priority constant for the println method; use Log.w.
     */
    const val WARN = 5

    /**
     * Priority constant for the println method; use Log.e.
     */
    const val ERROR = 6

    /**
     * Priority constant for the println method.
     */
    const val ASSERT = 7


    /**
     * unify 'enable' control
     * @see BaseLogger.enable
     */
    var enable = true

    /**
     * unify 'logLevel' control
     * @see BaseLogger.logLevel
     */
    var logLevel = ILogger.VERBOSE

    private val mLoggerDelegate: ITaggedLogger = BaseAndroidLogger()


    // delegate
    override fun v(tag: String, msg: String) {
        mLoggerDelegate.v(tag, msg)
    }

    override fun v(tag: String, msg: String, tr: Throwable) {
        mLoggerDelegate.v(tag, msg, tr)
    }

    override fun d(tag: String, msg: String) {
        mLoggerDelegate.d(tag, msg)
    }

    override fun d(tag: String, msg: String, tr: Throwable) {
        mLoggerDelegate.d(tag, msg, tr)
    }

    override fun i(tag: String, msg: String) {
        mLoggerDelegate.i(tag, msg)
    }

    override fun i(tag: String, msg: String, tr: Throwable) {
        mLoggerDelegate.i(tag, msg, tr)
    }

    override fun w(tag: String, msg: String) {
        mLoggerDelegate.w(tag, msg)
    }

    override fun w(tag: String, msg: String, tr: Throwable) {
        mLoggerDelegate.w(tag, msg, tr)
    }

    override fun w(tag: String, tr: Throwable) {
        mLoggerDelegate.w(tag, tr)
    }

    override fun e(tag: String, msg: String) {
        mLoggerDelegate.e(tag, msg)
    }

    override fun e(tag: String, msg: String, tr: Throwable) {
        mLoggerDelegate.e(tag, msg, tr)
    }

    override fun getTag(): String {
        return mLoggerDelegate.getTag()
    }
}