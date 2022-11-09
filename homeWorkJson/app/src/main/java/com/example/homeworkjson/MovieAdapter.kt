package com.example.homeworkjson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class MovieAdapter (val dataMovie: List<ResultsItem?>?) : RecyclerView.Adapter<MovieAdapter.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgmovie = view.findViewById<ImageView>(R.id.iv_cover)
        val title = view.findViewById<TextView>(R.id.tv_tittle)
        val desc = view.findViewById<TextView>(R.id.tv_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_layout_movie, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = dataMovie?.get(position)?.title
        holder.desc.text = dataMovie?.get(position)?.overview

        Glide.with(holder.imgmovie)
            .load("https://image.tmdb.org/t/p/w500/${dataMovie?.get(position)?.posterPath}")
            .error(R.drawable.ic_launcher_foreground)
            .into(holder.imgmovie)

        holder.itemView.setOnClickListener{
            val test = dataMovie?.get(position)?.title
            Toast.makeText(holder.itemView.context, "$(test)", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        if (dataMovie != null){
            return dataMovie.size
        }
        return 0
    }
}