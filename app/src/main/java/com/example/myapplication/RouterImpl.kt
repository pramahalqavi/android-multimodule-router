package com.example.myapplication

import android.app.Activity
import android.content.Intent
import com.example.router.IRouter

object RouterImpl: IRouter {

    fun navigateToActivityA(activity: Activity) {
        activity.startActivity(Intent(activity, ActivityAppA::class.java))
    }

    fun navigateToActivityB(activity: Activity) {
        activity.startActivity(Intent(activity, ActivityAppB::class.java))
    }
}