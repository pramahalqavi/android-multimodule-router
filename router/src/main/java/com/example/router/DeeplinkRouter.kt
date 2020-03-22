package com.example.router

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.net.Uri


object DeeplinkRouter {
    fun routeToSplash(activity: Activity, bundle: Bundle?) {
        val uri = Uri.parse("example://splash")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeToAppA(activity: Activity, bundle: Bundle? = null) {
        val uri = Uri.parse("example://activity-app-a")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeToAppB(activity: Activity, bundle: Bundle? = null) {
        val uri = Uri.parse("example://activity-app-b")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo01A(activity: Activity, bundle: Bundle? = null) {
        val uri = Uri.parse("example://activity-01-a")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo01B(activity: Activity, bundle: Bundle? = null) {
        val uri = Uri.parse("example://activity-01-b")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo02A(activity: Activity, bundle: Bundle? = null) {
        val uri = Uri.parse("example://activity-02-a")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo02B(activity: Activity, bundle: Bundle? = null) {
        val uri = Uri.parse("example://activity-02-b")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo03A(activity: Activity, bundle: Bundle? = null) {
        val uri = Uri.parse("example://activity-03-a")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
    fun routeTo03B(activity: Activity, bundle: Bundle? = null) {
        val uri = Uri.parse("example://activity-03-b")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
}