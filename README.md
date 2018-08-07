# DLog
Powerful Android Logger  

## Usage

```groovy
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}

dependencies {
    compile 'com.github.hackforid:dlog:0.1.0'
}
```

```kotlin
// sample
DLog.v("hello world") // tag will set to caller class as Default
DLog.i(TAG, "foooo")

// custom logger
object AppLog: BaseAndroidLogger()
AppLog.w("this is app log")

// config
DLog.enable = true // global enable logger
DLog.logLevel = DLog.VERBOSE // config log level

AppLog.enable = false // config custom log
AppLog.logLevel = DLog.INFO
AppLog.showCallerInMessage = true // show extra caller info

```

There are many convenient feature, you can  check it in source code.