package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import com.example.base.CoreActivity
import com.example.router.IRouter

class MainActivity : CoreActivity() {

    private val mRouter: IRouter = RouterImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.bt_act_a).setOnClickListener {
            mRouter.routeToAppA(this)
        }
        findViewById<Button>(R.id.bt_act_b).setOnClickListener {
            mRouter.routeToAppB(this)
        }
    }
}
