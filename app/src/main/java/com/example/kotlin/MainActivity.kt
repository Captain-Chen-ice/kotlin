package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.R
import com.example.kotlin.utils.AppUtils
import com.example.kotlin.view.ViewManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var viewManager: ViewManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppUtils.register(this)
        initData()
    }
    fun initData(){
        viewManager = ViewManager(this,recycle_item)
    }
}