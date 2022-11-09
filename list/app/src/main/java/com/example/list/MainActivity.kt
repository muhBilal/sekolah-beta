package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val listOfFood = arrayListOf<String>(
//            "Sate",
//            "Nasi Goreng",
//            "Nasi Campur",
//            "Nasi Rames",
//            "Mie Goreng",
//            "Ayam Goreng",
//            "Nasi Goreng",
//            "Nasi",
//            "Nasi Rames",
//            "Mie Goreng",
//            "Ayam Goreng",
//            "Nasi Goreng",
//        )

//        jika menggunakan set
//        val listOfFood = arrayListOf<String>()
//        listOfFood.add("Nasi Goreng")
//        listOfFood.add("Mie Goreng")
//        listOfFood.add("Soto")
//        listOfFood.add("Ayam Goreng")
//        listOfFood.add("Bebek Goreng")


//        val lvAdapter = ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1,
//            android.R.id.text1,
//            listOfFood
//        )

//        findViewById<ListView>(R.id.lv_food).adapter = lvAdapter
//        val lvFood = findViewById<ListView>(R.id.lv_food)
//        lvFood.adapter = lvAdapter
//        lvFood.setOnItemClickListener { adapterView, view, i, l ->
//            Toast.makeText(this, listOfFood[i], Toast.LENGTH_SHORT).show()
//                0 -> {
//                    Toast.makeText(this, listOfFood[i], Toast.LENGTH_SHORT).show()
//                }
//                1 -> {
//                    Toast.makeText(this, listOfFood[i], Toast.LENGTH_SHORT).show()
//                }
//            }
//        }
    }
}