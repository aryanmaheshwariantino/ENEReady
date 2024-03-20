package com.aryan.eneready.utils

fun <T> List<T>.toArrayList():ArrayList<T>{
    val arrayList = ArrayList<T>()
    this.forEach{
        arrayList.add(it)
    }
    return arrayList
}