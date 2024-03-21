package com.aryan.eneready.views.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aryan.eneready.models.CardItem
import com.aryan.eneready.models.CardItem2
import com.aryan.eneready.networks.MyRepository

class SearchScreenViewModel(private val repository: MyRepository) :ViewModel(){
    private val _dataList = MutableLiveData<List<CardItem>>()
    val dataList: LiveData<List<CardItem>>
        get() = _dataList

    private val _dataList2 = MutableLiveData<List<CardItem2>>()
    val dataList2: LiveData<List<CardItem2>>
        get() = _dataList2

    init {
        _dataList.value = repository.getDataList()
        _dataList2.value = repository.getDataList2()
    }
}

class SearchScreenViewModelFactory(private val repository: MyRepository
) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SearchScreenViewModel(repository) as T
    }
}