package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.router.DeeplinkRouter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.bt_act_a).setOnClickListener {
            RouterImpl.navigateToActivityA(this)
        }
        findViewById<Button>(R.id.bt_act_b).setOnClickListener {
            RouterImpl.navigateToActivityB(this)
        }
    }
}
