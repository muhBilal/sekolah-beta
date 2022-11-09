package com.example.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapter(private val eventHandling: (Movie) -> Unit) :
    RecyclerView.Adapter<MovieListHolder>() {
    private val dataset = arrayListOf<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListHolder {
        return MovieListHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_movie_holder, parent, false), eventHandling
        )
    }

    override fun onBindViewHolder(holder: MovieListHolder, position: Int) {
        holder.onBindView(dataset[position])
    }

    override fun getItemCount(): Int = dataset.size

    fun setNewItem(newDataset: ArrayList<Movie>) {
        dataset.clear()
        dataset.addAll(newDataset)
        notifyDataSetChanged()
    }

}