package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.feature01.Activity01A
import com.example.feature01.Activity01B
import com.example.feature02.Activity02A
import com.example.feature02.Activity02B
import com.example.feature03.Activity03A
import com.example.feature03.Activity03B
import com.example.router.Router

class RouterImpl: Router.IRouter {
    init {
        Router.init(this)
    }
    override fun routeToAppA(activity: Activity, bundle: Bundle?) {
        val intent = Intent(activity, ActivityAppA::class.java)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }

    override fun routeToAppB(activity: Activity, bundle: Bundle?) {
        val intent = Intent(activity, ActivityAppB::class.java)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }

    override fun routeTo01A(activity: Activity, bundle: Bundle?) {
        val intent = Intent(activity, Activity01A::class.java)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }

    override fun routeTo01B(activity: Activity, bundle: Bundle?) {
        val intent = Intent(activity, Activity01B::class.java)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }

    override fun routeTo02A(activity: Activity, bundle: Bundle?) {
        val intent = Intent(activity, Activity02A::class.java)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }

    override fun routeTo02B(activity: Activity, bundle: Bundle?) {
        val intent = Intent(activity, Activity02B::class.java)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }

    override fun routeTo03A(activity: Activity, bundle: Bundle?) {
        val intent = Intent(activity, Activity03A::class.java)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }

    override fun routeTo03B(activity: Activity, bundle: Bundle?) {
        val intent = Intent(activity, Activity03B::class.java)
        bundle?.let {
            intent.putExtras(it)
        }
        activity.startActivity(intent)
    }
}