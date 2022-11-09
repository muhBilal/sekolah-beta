package com.example.list

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class MovieListHolder(itemView: View, val eventHandling: (Movie) -> Unit) :
    RecyclerView.ViewHolder(itemView) {
    val tvTitle = itemView.findViewById<TextView>(R.id.tv_title)
    val tvDesc = itemView.findViewById<TextView>(R.id.tv_desc)
    val ivCover = itemView.findViewById<ImageView>(R.id.iv_cover)

    fun onBindView(movie: Movie) {
        tvTitle.text = movie.title
        tvDesc.text = movie.desc

        ivCover.setImageDrawable(
            ContextCompat.getDrawable(
                itemView.context,
                movie.imgCovert
            )
        )
        itemView.setOnClickListener {eventHandling(movie)}

    }
}