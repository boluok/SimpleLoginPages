package com.example.firstloginpages


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class CongratsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats)

        supportActionBar?.hide()



    }

}