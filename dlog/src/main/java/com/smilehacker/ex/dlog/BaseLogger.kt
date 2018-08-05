package com.smilehacker.ex.dlog

abstract class BaseLogger: ITaggedLogger {

    /**
     * enable logger
     * if set it to false, no log will show.
     */
    var enable : Boolean = true

    /**
     * when log method's level bigger than logLevel,  it will show
     */
    var logLevel: Int = ILogger.VERBOSE

    /**
     * show caller stack in msg
     */
    var appendCallerToMessage = false


    abstract fun getLogger(): ILogger

    override fun v(tag: String, msg: String) {
        whenEnable(ILogger.VERBOSE) {
            getLogger().v(tag, fillMsg(msg))
        }
    }

    override fun v(tag: String, msg: String, tr: Throwable) {
        whenEnable(ILogger.VERBOSE) {
            getLogger().v(tag, fillMsg(msg), tr)
        }
    }

    override fun d(tag: String, msg: String) {
        whenEnable(ILogger.DEBUG) {
            getLogger().d(tag, fillMsg(msg))
        }
    }

    override fun d(tag: String, msg: String, tr: Throwable) {
        whenEnable(ILogger.DEBUG) {
            getLogger().d(tag, fillMsg(msg), tr)
        }
    }

    override fun i(tag: String, msg: String) {
        whenEnable(ILogger.INFO) {
            getLogger().i(tag, fillMsg(msg))
        }
    }

    override fun i(tag: String, msg: String, tr: Throwable) {
        whenEnable(ILogger.INFO) {
            getLogger().i(tag, fillMsg(msg), tr)
        }
    }

    override fun w(tag: String, msg: String) {
        whenEnable(ILogger.WARN) {
            getLogger().w(tag, fillMsg(msg))
        }
    }

    override fun w(tag: String, msg: String, tr: Throwable) {
        whenEnable(ILogger.WARN) {
            getLogger().w(tag, fillMsg(msg), tr)
        }
    }

    override fun w(tag: String, tr: Throwable) {
        whenEnable(ILogger.WARN) {
            if (appendCallerToMessage) {
                getLogger().w(tag, fillMsg(""), tr)
            } else {
                getLogger().w(tag, tr)
            }
        }
    }

    override fun e(tag: String, msg: String) {
        whenEnable(ILogger.ERROR) {
            getLogger().e(tag, fillMsg(msg))
        }
    }

    override fun e(tag: String, msg: String, tr: Throwable) {
        whenEnable(ILogger.ERROR) {
            getLogger().e(tag, fillMsg(msg), tr)
        }
    }

    private inline fun whenEnable(level: Int, r: ()->Unit) {
        if (enable && DLog.enable && level >= logLevel && level >= DLog.logLevel) {
            r()
        }
    }

    private fun fillMsg(msg: String) : String {
        if (appendCallerToMessage) {
            return "[${getCallStack()}] >>\n$msg"
        } else {
            return msg
        }
    }

    override fun getTag(): String {
        return getCallStack().className
    }

    companion object {
        fun getCallStack() : StackTraceElement {
            val pkg = this::class.java.`package`.name
            val elements = Throwable().stackTrace
            return elements.find { !it.className.contains(pkg) } ?: elements[0]
        }
    }
}