package com.aryan.eneready.views

import CardAdapter
import CardAdapter2
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aryan.eneready.R
import com.aryan.eneready.databinding.ActivitySearchScreenBinding
import com.aryan.eneready.models.CardItem
import com.aryan.eneready.models.CardItem2
import com.aryan.eneready.networks.MyRepository
import com.aryan.eneready.views.viewmodel.SearchScreenViewModel
import com.aryan.eneready.views.viewmodel.SearchScreenViewModelFactory

class SearchScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySearchScreenBinding
    private lateinit var adapter: CardAdapter
    private lateinit var adapter2: CardAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView: RecyclerView = binding.recylerview
        recyclerView.layoutManager = LinearLayoutManager(this)


        val viewModel = ViewModelProvider(this,SearchScreenViewModelFactory(MyRepository())).get(SearchScreenViewModel::class.java)

        binding.nearbystationtext.setOnClickListener {
            binding.nearbystationtext.setTextColor(resources.getColor(R.color.onchangedtextcolor))
            binding.recenttext.setTextColor(resources.getColor(R.color.recenttext))
            recyclerView.adapter = adapter
            setupSearchView(binding.searchEditText, adapter)
        }

        binding.recenttext.setOnClickListener{
            binding.nearbystationtext.setTextColor(resources.getColor(R.color.recenttext))
            binding.recenttext.setTextColor(resources.getColor(R.color.onchangedtextcolor))
            recyclerView.adapter = adapter2
            setupSearchView(binding.searchEditText, adapter2)
        }
        viewModel.dataList.observe(this) { dataList ->
            adapter = CardAdapter(dataList)
            recyclerView.adapter = adapter
        }

        viewModel.dataList2.observe(this) { dataList2 ->
            adapter2 = CardAdapter2(dataList2)
            recyclerView.adapter = adapter2
        }
    }

    private fun setupSearchView(searchEditText: SearchView, adapter: RecyclerView.Adapter<*>) {
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
