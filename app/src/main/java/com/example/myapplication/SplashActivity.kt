package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import com.example.base.BaseApplication
import com.example.base.CoreActivity
import com.example.router.Router

class SplashActivity : CoreActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Router.init(RouterImpl())
        BaseApplication.isAppInitialized = true
        Handler().postDelayed(Runnable {
            Router.routeToAppA(this)
            finish()
        }, 3000)
    }
}
