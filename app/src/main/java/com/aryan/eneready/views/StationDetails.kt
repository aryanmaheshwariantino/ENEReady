package com.aryan.eneready.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aryan.eneready.R
import com.aryan.eneready.databinding.ActivitySearchScreenBinding
import com.aryan.eneready.databinding.ActivityStationDetailsBinding

class StationDetails : AppCompatActivity() {
    private lateinit var binding: ActivityStationDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_station_details)

    }
}