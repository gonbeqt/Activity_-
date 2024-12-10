package com.example.myapplication


import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class listadapter(private val context: Activity,private  val arrayList: ArrayList<dataitems>) : ArrayAdapter<dataitems>(context,
    R.layout.listitems,arrayList)
 {
     override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
         val inflater: LayoutInflater = LayoutInflater.from(context)
         val view: View = inflater.inflate(R.layout.listitems, null)

         val country: TextView = view.findViewById(R.id.countryList)

         country.text = arrayList[position].country


         return view
     }

}