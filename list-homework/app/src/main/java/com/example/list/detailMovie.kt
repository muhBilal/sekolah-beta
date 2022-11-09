package com.example.list

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.internal.ToolbarUtils
import com.squareup.picasso.Picasso

class detailMovie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)


        val b = intent.extras
        val movie = b?.getParcelable<Movie>("movie")

        Toast.makeText(this, movie?.title, Toast.LENGTH_SHORT).show()

        val detailTitle = findViewById(R.id.tv_detail_title) as TextView
        val detailDesc = findViewById(R.id.tv_detail_desc) as TextView
        val detailCover = findViewById<ImageView>(R.id.ivCoverDetail)

        detailTitle.text = movie?.title
        detailDesc.text = movie?.desc
        Picasso.get().load("https://image.tmdb.org/t/p/w500/${movie?.imgCovert}").into(detailCover)
    }
}