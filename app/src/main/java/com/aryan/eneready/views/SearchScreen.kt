package com.aryan.eneready.views

import CardAdapter
import CardAdapter2
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aryan.eneready.R
import com.aryan.eneready.databinding.ActivitySearchScreenBinding
import com.aryan.eneready.models.CardItem
import com.aryan.eneready.models.CardItem2

class SearchScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySearchScreenBinding
    private lateinit var adapter: CardAdapter
    private lateinit var adapter2: CardAdapter2
    private val dataList2 = arrayListOf(
        CardItem2(
            "Open Valley EV Station",
            "Available",
            R.drawable.heart,
            "Emery Point, Pacocha Motorway, \n Singapore",
            R.drawable.star_1,
            "4.0",
            R.drawable.line_8,
            R.drawable.gas_station,
            "3 Lots",
            R.drawable.line_8,
            R.drawable.routing,
            "1.4km",
            "Last used on 12th Jan 05:00PM",
            "Reserve",
            "ViewDetails"
        ),
        CardItem2(
            "Gurgaon EV Station",
            "Available",
            R.drawable.heart,
            "Emery Point, Pacocha Motorway, \n Singapore",
            R.drawable.star_1,
            "4.0",
            R.drawable.line_8,
            R.drawable.gas_station,
            "3 Lots",
            R.drawable.line_8,
            R.drawable.routing,
            "1.4km",
            "Last used on 12th Jan 05:00PM",
            "Reserve",
            "ViewDetails"
        ),
        CardItem2(
            "Delhi EV Station",
            "Available",
            R.drawable.heart,
            "Emery Point, Pacocha Motorway, \n Singapore",
            R.drawable.star_1,
            "4.0",
            R.drawable.line_8,
            R.drawable.gas_station,
            "3 Lots",
            R.drawable.line_8,
            R.drawable.routing,
            "1.4km",
            "Last used on 12th Jan 05:00PM",
            "Reserve",
            "ViewDetails"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView: RecyclerView = binding.recylerview
        recyclerView.layoutManager = LinearLayoutManager(this)

        binding.nearbystationtext.setOnClickListener {
            binding.nearbystationtext.setTextColor(resources.getColor(R.color.onchangedtextcolor))
            binding.recenttext.setTextColor(resources.getColor(R.color.recenttext))

            val dataList = listOf(
                CardItem(
                    "Open Valley EV Station",
                    "Available",
                    R.drawable.heart,
                    "Emery Point, Pacocha Motorway,\n Singapore",
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
                    "Gurgaon EV Station",
                    "Available",
                    R.drawable.heart,
                    "Emery Point, Pacocha Motorway,\n Singapore",
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
                    "Delhi EV Station",
                    "Available",
                    R.drawable.heart,
                    "Emery Point, Pacocha Motorway,\n Singapore",
                    R.drawable.star_1,
                    "4.0",
                    R.drawable.line_8,
                    R.drawable.gas_station,
                    "3 Lots",
                    R.drawable.line_8,
                    R.drawable.routing,
                    "1.4km"
                )
            )
            adapter = CardAdapter(dataList)
            recyclerView.adapter = adapter
            setupSearchView(binding.searchEditText, adapter, dataList)
        }

        binding.recenttext.setOnClickListener{
            binding.nearbystationtext.setTextColor(resources.getColor(R.color.recenttext))
            binding.recenttext.setTextColor(resources.getColor(R.color.onchangedtextcolor))
            adapter2 = CardAdapter2(dataList2)
            recyclerView.adapter = adapter2
            setupSearchView(binding.searchEditText, adapter2, dataList2)
        }
    }

    private fun setupSearchView(searchEditText: SearchView, adapter: RecyclerView.Adapter<*>, dataList: List<*>) {
        searchEditText.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (adapter is CardAdapter) {
                    adapter.filterByText(newText.orEmpty())
                } else if (adapter is CardAdapter2) {
                    adapter.filterByText(newText.orEmpty())
                }
                return false
            }
        })
    }
}
