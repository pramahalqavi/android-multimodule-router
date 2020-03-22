package com.example.router

import android.app.Activity
import android.os.Bundle

interface IRouter {
    fun routeToAppA(activity: Activity, bundle: Bundle? = null)
    fun routeToAppB(activity: Activity, bundle: Bundle? = null)
    fun routeTo01A(activity: Activity, bundle: Bundle? = null)
    fun routeTo01B(activity: Activity, bundle: Bundle? = null)
    fun routeTo02A(activity: Activity, bundle: Bundle? = null)
    fun routeTo02B(activity: Activity, bundle: Bundle? = null)
    fun routeTo03A(activity: Activity, bundle: Bundle? = null)
    fun routeTo03B(activity: Activity, bundle: Bundle? = null)
}