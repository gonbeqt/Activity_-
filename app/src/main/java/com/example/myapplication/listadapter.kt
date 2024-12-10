package com.example.myapplication


import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.TextView

class listadapter(private val context: Context, private  val countryList: List<CountryInfo>) : ArrayAdapter<CountryInfo>(context,
    R.layout.listitems,countryList)
 {
     override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
         val inflater: LayoutInflater = LayoutInflater.from(context)
         val view: View = inflater.inflate(R.layout.listitems, null)

         val country: TextView = view.findViewById(R.id.country)
         val capital: TextView = view.findViewById(R.id.capital)
         val flag: ImageView = view.findViewById(R.id.flag)

         flag.setImageResource(countryList[position].flagId)
         country.text = "Country: " + countryList[position].country
         capital.text = "Capital: " + countryList[position].capital
         return view
     }
}