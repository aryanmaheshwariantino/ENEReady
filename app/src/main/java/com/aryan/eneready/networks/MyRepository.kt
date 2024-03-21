package com.aryan.eneready.networks

import com.aryan.eneready.R
import com.aryan.eneready.models.CardItem
import com.aryan.eneready.models.CardItem2

class MyRepository {
    fun getDataList(): List<CardItem> {
        return dataList
    }

    fun getDataList2(): List<CardItem2> {
        return dataList2
    }
    private val dataList = listOf(
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
        CardItem(
            "Old Delhi EV Station",
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
            "New Delhi EV Station",
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
            "Gurugram EV Station",
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
        ),
        CardItem2(
            "Old Delhi EV Station",
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
            "New Delhi EV Station",
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
}