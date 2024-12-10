package com.example.myapplication

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapteroflist: ArrayList<dataitems>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Your list of countries
        val country = listOf(
            "Philippines", "Canada", "United States", "Sweden", "Germany", "Italy",
            "Australia", "Finland", "Denmark", "Netherlands", "Spain", "Belgium",
            "Ireland", "Japan", "China", "South Korea", "India", "Brazil", "Russia", "Thailand"
        )

        // Initialize the adapter's data
        adapteroflist = ArrayList()
        for (i in country.indices) {
            adapteroflist.add(dataitems(country[i]))
        }

        // Access the ListView directly using binding
        val listView: ListView = binding.listView  // Access ListView via binding
        val adapter = listadapter(this, adapteroflist)  // Set custom adapter
        listView.adapter = adapter  // Set the adapter to the ListView
    }
}
