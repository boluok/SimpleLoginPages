package com.example.firstloginpages


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class GuideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityguide)

        supportActionBar?.hide()
    }

}