# DLog
[![Release](https://jitpack.io/v/Hackforid/DLog.svg)](https://jitpack.io/#Hackforid/DLog)  

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

License
-------

    Copyright 2018 Hackforid

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
