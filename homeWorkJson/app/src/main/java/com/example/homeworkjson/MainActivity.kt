package com.example.homeworkjson

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworkjson.Api.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movie = findViewById<RecyclerView>(R.id.rv_movie)

        ApiConfig.getService().getMovie("473e71363d36bdfab0a8cc7bb116b67e").enqueue(object : Callback<ResponseMovie>{
            @SuppressLint("NotifyDataSetChanged")
            override fun onResponse(call: Call<ResponseMovie>, response: Response<ResponseMovie>) {
                if (response.isSuccessful) {
                    val responseMovie = response.body()
                    val dataMovie = responseMovie?.results
                    val movieAdapter = MovieAdapter(dataMovie)
                    movie.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        setHasFixedSize(true)
                        movieAdapter.notifyDataSetChanged()
                        adapter = movieAdapter
                    }
                }else{
                    Toast.makeText(this@MainActivity, "gagal", Toast.LENGTH_SHORT).show()
                }
            }


            override fun onFailure(call: Call<ResponseMovie>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }

        })
    }
}