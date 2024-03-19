package com.aryan.eneready.views

import CardAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aryan.eneready.R
import com.aryan.eneready.databinding.ActivitySearchScreenBinding
import com.aryan.eneready.models.CardItem

class SearchScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySearchScreenBinding
    private lateinit var adapter: CardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView: RecyclerView = binding.recylerview
        recyclerView.layoutManager = LinearLayoutManager(this)

        binding.recenttext
        binding.nearbystationtext

        val dataList = listOf(
            CardItem(
                "Open Valley EV Station",
                "Available",
                R.drawable.heart,
                "Emery Point, Pacocha Motorway, Singapore",
                R.drawable.star_1,
                "4.0",
                R.drawable.line_8,
                R.drawable.gas_station,
                "3 Lots",
                R.drawable.line_8,
                R.drawable.routing,
                "1.4km"
            ),
            CardItem(
                "Open Valley EV Station",
                "Available",
                R.drawable.heart,
                "Emery Point, Pacocha Motorway, Singapore",
                R.drawable.star_1,
                "4.0",
                R.drawable.line_8,
                R.drawable.gas_station,
                "3 Lots",
                R.drawable.line_8,
                R.drawable.routing,
                "1.4km"
            ),
            CardItem(
                "Open Valley EV Station",
                "Available",
                R.drawable.heart,
                "Emery Point, Pacocha Motorway, Singapore",
                R.drawable.star_1,
                "4.0",
                R.drawable.line_8,
                R.drawable.gas_station,
                "3 Lots",
                R.drawable.line_8,
                R.drawable.routing,
                "1.4km"
            ),
        )

        adapter = CardAdapter(dataList)
        recyclerView.adapter = adapter
    }
}
