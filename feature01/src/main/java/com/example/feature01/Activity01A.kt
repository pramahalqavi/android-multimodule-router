package com.example.feature01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.router.DeeplinkRouter

class Activity01A : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_01_a)
        DeeplinkRouter.routeTo()
    }
}
