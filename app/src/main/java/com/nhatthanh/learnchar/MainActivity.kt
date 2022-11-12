package com.nhatthanh.learnchar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.nhatthanh.learnchar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        setupBarCharValue()
    }

    private fun setupBarCharValue() {
        val xvalue=ArrayList<String>()
        xvalue.add("Monday")
        xvalue.add("Tuesday")
        xvalue.add("Wednesday")
        xvalue.add("Thursday")
        xvalue.add("Friday")
        xvalue.add("Saturday")
        xvalue.add("Sunday")

        val barentries=ArrayList<BarEntry>()
        barentries.add(BarEntry(1f,2f))
        barentries.add(BarEntry(2f,0f))
        barentries.add(BarEntry(3f,0f))
        barentries.add(BarEntry(4f,0f))
        barentries.add(BarEntry(5f,0f))
        barentries.add(BarEntry(6f,0f))
        barentries.add(BarEntry(7f,0f))

        val barDataSet=BarDataSet(barentries,"")

        val data=BarData(barDataSet)


    }
}