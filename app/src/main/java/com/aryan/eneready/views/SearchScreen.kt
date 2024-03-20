package com.aryan.eneready.views

import CardAdapter
import CardAdapter2
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aryan.eneready.R
import com.aryan.eneready.databinding.ActivitySearchScreenBinding
import com.aryan.eneready.models.CardItem
import com.aryan.eneready.models.CardItem2
import com.aryan.eneready.utils.toArrayList
import java.util.Locale.filter


class SearchScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySearchScreenBinding
    private lateinit var adapter: CardAdapter
    private lateinit var adapter2: CardAdapter2
    val dataList2 = arrayListOf(
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
        ),
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
                ),
            )
            adapter = CardAdapter(dataList)
            recyclerView.adapter = adapter
        }
        binding.recenttext.setOnClickListener{
            binding.nearbystationtext.setTextColor(resources.getColor(R.color.recenttext))
            binding.recenttext.setTextColor(resources.getColor(R.color.onchangedtextcolor))
            adapter2 = CardAdapter2(dataList2)
            recyclerView.adapter = adapter2
        }
        binding.searchEditText.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText.isNullOrEmpty()){
                    adapter2.filterByText(dataList2)
                }else{
                    adapter2.filterByText(dataList2.filter { it.openValleyText.contains(newText?:"", ignoreCase = true) }.toArrayList())
                }
                return false
            }

        }

        )







    }
}
