package com.example.list

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MovieListHolder(itemView: View, val eventHandling: (Movie) -> Unit) :
    RecyclerView.ViewHolder(itemView) {
    val tvTitle = itemView.findViewById<TextView>(R.id.tv_title)
    val tvDesc = itemView.findViewById<TextView>(R.id.tv_desc)
    val ivCover = itemView.findViewById<ImageView>(R.id.iv_cover)

    fun onBindView(movie: Movie) {
        tvTitle.text = movie.title
        tvDesc.text = movie.desc
        Picasso.get().load("https://image.tmdb.org/t/p/w500/${movie.imgCovert}").into(ivCover);

//        ivCover.setImageDrawable(
//            ContextCompat.getDrawable(
//                itemView.context,
//                movie.imgCovert
//            )
//        )
//        itemView.setOnClickListener {eventHandling(movie)}

    }
}