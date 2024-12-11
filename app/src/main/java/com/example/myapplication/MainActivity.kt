package com.example.myapplication

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapteroflist: ArrayList<CountryInfo>
    private lateinit var btnExit: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Your list of countries, capital and flags
        val countriesWithFlags = listOf(
            CountryInfo("Afghanistan", "Kabul", R.drawable.afghanistan),
            CountryInfo("Albania", "Tirana", R.drawable.albania),
            CountryInfo("Algeria", "Algiers", R.drawable.algeria),
            CountryInfo("Benin", "Porto-Novo", R.drawable.benin),
            CountryInfo("Bhutan", "Thimphu", R.drawable.bhutan),
            CountryInfo("Bolivia", "Sucre", R.drawable.bolivia),
            CountryInfo("Botswana", "Gaborone", R.drawable.botswana),
            CountryInfo("Brunei", "Bandar Seri Begawan", R.drawable.brunei),
            CountryInfo("Canada", "Ottawa", R.drawable.canada),
            CountryInfo("China", "Beijing", R.drawable.china),
            CountryInfo("Denmark", "Copenhagen", R.drawable.denmark),
            CountryInfo("Ecuador", "Quito", R.drawable.ecuador),
            CountryInfo("France", "Paris", R.drawable.france),
            CountryInfo("Indonesia", "Jakarta", R.drawable.indonesia),
            CountryInfo("Malaysia", "Kuala Lumpur", R.drawable.malaysia),
            CountryInfo("Nigeria", "Abuja", R.drawable.nigeria),
            CountryInfo("Philippines", "Manila", R.drawable.philippines),
            CountryInfo("Sudan", "Khartoum", R.drawable.sudan),
            CountryInfo("Syria", "Damascus", R.drawable.syria),
            CountryInfo("Yemen", "Sana'a", R.drawable.yemen)
        )

        // Initialize the adapter's data
        adapteroflist = ArrayList(countriesWithFlags)
        btnExit = findViewById(R.id.btnExit)
        // Access the ListView directly using binding
        val listView: ListView = binding.listView  // Access ListView via binding
        val adapter = listadapter(this, adapteroflist)  // Set custom adapter
        listView.adapter = adapter  // Set the adapter to the ListView

        btnExit.setOnClickListener {

            finishAffinity()
        }
    }
}
