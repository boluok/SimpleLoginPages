package com.example.firstloginpages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {
    val testCountries = listOf(Country(R.drawable.argentina,"Argentina"),Country(R.drawable.brazil,"Brazil"),
        Country(R.drawable.austriala,"Australia"),Country(R.drawable.austriala,"Fake country")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val linearLayoutManager = LinearLayoutManager(this)
        val adaptor = CountyAdaptor(testCountries)
        recycler.layoutManager = linearLayoutManager
        recycler.adapter = adaptor
    }
}



data class Country(
    val flag:Int, val name:String
)