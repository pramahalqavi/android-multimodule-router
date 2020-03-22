package com.example.router

import android.app.Activity
import android.content.Intent
import android.os.Bundle

object ClassNameRouter {
    fun routeToSplash(activity: Activity, bundle: Bundle?) {
        val intent = Intent()
        intent.setClassName(activity, "com.example.myapplication.SplashActivity")
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeToAppA(activity: Activity, bundle: Bundle? = null) {
        val intent = Intent()
        intent.setClassName(activity, "com.example.myapplication.ActivityAppA")
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeToAppB(activity: Activity, bundle: Bundle? = null) {
        val intent = Intent()
        intent.setClassName(activity, "com.example.myapplication.ActivityAppB")
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo01A(activity: Activity, bundle: Bundle? = null) {
        val intent = Intent()
        intent.setClassName(activity, "com.example.feature01.Activity01A")
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo01B(activity: Activity, bundle: Bundle? = null) {
        val intent = Intent()
        intent.setClassName(activity, "com.example.feature01.Activity01B")
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo02A(activity: Activity, bundle: Bundle? = null) {
        val intent = Intent()
        intent.setClassName(activity, "com.example.feature02.Activity02A")
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo02B(activity: Activity, bundle: Bundle? = null) {
        val intent = Intent()
        intent.setClassName(activity, "com.example.feature02.Activity02B")
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo03A(activity: Activity, bundle: Bundle? = null) {
        val intent = Intent()
        intent.setClassName(activity, "com.example.feature03.Activity03A")
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo03B(activity: Activity, bundle: Bundle? = null) {
        val intent = Intent()
        intent.setClassName(activity, "com.example.feature03.Activity03B")
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
}