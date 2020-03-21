package com.example.myapplication

import android.app.Activity
import android.content.Intent

object Router {

    fun navigateToActivityA(activity: Activity) {
        activity.startActivity(Intent(activity, ActivityA::class.java))
    }

    fun navigateToActivityB(activity: Activity) {
        activity.startActivity(Intent(activity, ActivityB::class.java))
    }
}