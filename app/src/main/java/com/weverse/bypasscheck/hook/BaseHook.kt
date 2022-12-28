package com.weverse.bypasscheck.hook

abstract class BaseHook {
    var isInit: Boolean = false
    abstract fun init()
}
