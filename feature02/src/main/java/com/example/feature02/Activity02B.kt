package com.example.feature02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.base.CoreActivity
import com.example.router.ClassNameRouter
import com.example.router.DeeplinkRouter
import com.example.router.Router

class Activity02B : CoreActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Activity 02 B"
        setContentView(R.layout.activity_02_b)
        findViewById<Button>(R.id.bt_app_a).setOnClickListener {
            DeeplinkRouter.routeToAppA(this)
        }
        findViewById<Button>(R.id.bt_app_b).setOnClickListener {
            ClassNameRouter.routeToAppB(this)
        }
        findViewById<Button>(R.id.bt_01_a).setOnClickListener {
            Router.routeTo01A(this)
        }
        findViewById<Button>(R.id.bt_01_b).setOnClickListener {
            Router.routeTo01B(this)
        }
        findViewById<Button>(R.id.bt_02_a).setOnClickListener {
            ClassNameRouter.routeTo02A(this)
        }
        findViewById<Button>(R.id.bt_02_b).setOnClickListener {
            ClassNameRouter.routeTo02B(this)
        }
        findViewById<Button>(R.id.bt_03_a).setOnClickListener {
            DeeplinkRouter.routeTo03A(this)
        }
        findViewById<Button>(R.id.bt_03_b).setOnClickListener {
            DeeplinkRouter.routeTo03B(this)
        }
    }
}
