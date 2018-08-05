package com.smilehacker.ex.dlog

interface ITaggedLogger: ILogger {
    /**
     * Send a {@link #VERBOSE} log message.
     * @param msg The message you would like logged.
     */
    fun v(msg: String) {
        v(getTag(), msg)
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    fun v(msg: String, tr: Throwable) {
        v(getTag(), msg, tr)
    }

    /**
     * Send a {@link #DEBUG} log message.
     * @param msg The message you would like logged.
     */
    fun d(msg: String) {
        d(getTag(), msg)
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    fun d(msg: String, tr: Throwable) {
        d(getTag(), msg, tr)
    }

    /**
     * Send an {@link #INFO} log message.
     * @param msg The message you would like logged.
     */
    fun i(msg: String) {
        i(getTag(), msg)
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    fun i(msg: String, tr: Throwable) {
        i(getTag(), msg, tr)
    }

    /**
     * Send a {@link #WARN} log message.
     * @param msg The message you would like logged.
     */
    fun w(msg: String) {
        w(getTag(), msg)
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    fun wt(msg: String, tr: Throwable) {
        w(getTag(), msg, tr)
    }

    /*
     * Send a {@link #WARN} log message and log the exception.
     * @param tr An exception to log
     */
    fun w(tr: Throwable) {
        w(getTag(), tr)
    }

    /**
     * Send an {@link #ERROR} log message.
     * @param msg The message you would like logged.
     */
    fun e(msg: String) {
        e(getTag(), msg)
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    fun e(msg: String, tr: Throwable) {
        e(getTag(), msg, tr)
    }

    /**
     * provider default tag to Logger
     * @return Logger's Tag
     */
    fun getTag(): String
}