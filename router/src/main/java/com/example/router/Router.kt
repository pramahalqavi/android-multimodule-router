package com.example.router

import android.app.Activity
import android.os.Bundle

object Router {

    private lateinit var mIRouter: IRouter

    fun init(router: IRouter) {
        mIRouter = router
    }

    fun routeToAppA(activity: Activity, bundle: Bundle? = null) {
        mIRouter.routeToAppA(activity, bundle)
    }
    fun routeToAppB(activity: Activity, bundle: Bundle? = null) {
        mIRouter.routeToAppB(activity, bundle)
    }
    fun routeTo01A(activity: Activity, bundle: Bundle? = null) {
        mIRouter.routeTo01A(activity, bundle)
    }
    fun routeTo01B(activity: Activity, bundle: Bundle? = null) {
        mIRouter.routeTo01B(activity, bundle)
    }
    fun routeTo02A(activity: Activity, bundle: Bundle? = null) {
        mIRouter.routeTo02A(activity, bundle)
    }
    fun routeTo02B(activity: Activity, bundle: Bundle? = null) {
        mIRouter.routeTo02B(activity, bundle)
    }
    fun routeTo03A(activity: Activity, bundle: Bundle? = null) {
        mIRouter.routeTo03A(activity, bundle)
    }
    fun routeTo03B(activity: Activity, bundle: Bundle? = null) {
        mIRouter.routeTo03B(activity, bundle)
    }

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
}
