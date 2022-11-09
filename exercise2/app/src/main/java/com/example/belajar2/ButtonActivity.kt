package com.example.belajar2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        Log.d("log", "onCreate: ")
//        va    l btn = findViewById<Button>(R.id.btn1)
//
//        btn.apply {
//            setOnClickListener {
//                Toast.makeText(this@ButtonActivity, "Aku di click!", Toast.LENGTH_SHORT).show() // ini untuk di klik satu kali
//                val detail = Intent(this@ButtonActivity, DetailActivity::class.java)
//                startActivity(detail)
//            }
//            setOnLongClickListener {
//                Toast.makeText(this@ButtonActivity, "Aku di long-click", Toast.LENGTH_SHORT).show()
//                true
//            }
//        }

    }

    fun detailPage(v : View){
        val detail = Intent(this@ButtonActivity, DetailActivity::class.java)
        startActivity(detail)
    }

    override fun onStart() {
        super.onStart()
        Log.d("log", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("log", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("log", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("log", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("log", "onDestroy: ")
    }
}