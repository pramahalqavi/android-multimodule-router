package com.example.base

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.router.DeeplinkRouter

open class CoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (intent.data != null && intent.data != Uri.parse("example://splash") &&
            !BaseApplication.isAppInitialized) {
            DeeplinkRouter.routeToSplash(this, intent.extras)
            finish()
        }
    }
}
