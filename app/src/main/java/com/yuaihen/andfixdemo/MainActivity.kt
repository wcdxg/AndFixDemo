package com.yuaihen.andfixdemo

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //懒加载
    val mTvResult by lazy {
        //fbc
        tv_Tip
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTvResult.setTextColor(Color.GREEN)
        mTvResult.text = "这个是修复了bug的版本~~~~~~~~~~~~~~~~~~~"
        mTvResult.textSize = 50f
    }

}
