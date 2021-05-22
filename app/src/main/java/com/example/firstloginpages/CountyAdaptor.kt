package com.example.firstloginpages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_country.view.*

class CountyAdaptor(val countries:List<Country>) : RecyclerView.Adapter<CountyAdaptor.CountryViewHolder>() {

    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val ivFlag:ImageView = view.ivFlag
        val tvName:TextView =  view.tvName

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
       val country = countries[position]
        holder.ivFlag.setImageResource(country.flag)
        holder.tvName.text = country.name
    }
}

