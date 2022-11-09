package com.example.list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MovieListHolder(itemView: View, val eventHandling: (Movie) -> Unit) :
    RecyclerView.ViewHolder(itemView) {

    private val tvTitle = itemView.findViewById<TextView>(R.id.tv_title)
//    private val tvDesc = itemView.findViewById<TextView>(R.id.tv_desc)
    private val ivCover = itemView.findViewById<ImageView>(R.id.iv_cover)

    fun onBindView(movie: Movie) {
        tvTitle.text = movie.title
//        tvDesc.text = movie.desc
        Picasso.get().load("https://image.tmdb.org/t/p/w500/${movie.imgCovert}").into(ivCover)

        itemView.setOnClickListener{eventHandling(movie)}
    }
}