package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfMovies = arrayListOf<Movie>()
        listOfMovies.add(Movie("Fall", "For best friends Becky and Hunter, life is all about conquering fears and pushing limits. But after they climb 2,000 feet to the top of a remote, abandoned radio tower, they find themselves stranded with no way down. Now Becky and Hunter’s expert climbing skills will be put to the ultimate test as they desperately fight to survive the elements, a lack of supplies, and vertigo-inducing heights", "/2RSirqZG949GuRwN38MYCIGG4Od.jpg"))
        listOfMovies.add(Movie("Orphan: First Kill","After escaping from an Estonian psychiatric facility, Leena Klammer travels to America by impersonating Esther, the missing daughter of a wealthy family. But when her mask starts to slip, she is put against a mother who will protect her family from the murderous “child” at any cost.", "/5GA3vV1aWWHTSDO5eno8V5zDo8r.jpg"))
        listOfMovies.add(Movie("Pinocchio","A wooden puppet embarks on a thrilling adventure to become a real boy.","/nnUQqlVZeEGuCRx8SaoCU4XVHJN.jpg"))
        listOfMovies.add(Movie("Beast","A recently widowed man and his two teenage daughters travel to a game reserve in South Africa. However, their journey of healing soon turns into a fight for survival when a bloodthirsty lion starts to stalk them.","/1n7ZGr6WeDOW4rFiQKmFel8baWH.jpg"))
        listOfMovies.add(Movie("Samaritan","Thirteen year old Sam Cleary  suspects that his mysteriously reclusive neighbor Mr. Smith is actually the legendary vigilante Samaritan, who was reported dead 20 years ago. With crime on the rise and the city on the brink of chaos, Sam makes it his mission to coax his neighbor out of hiding to save the city from ruin.","/hYZ4a0JvPETdfgJJ9ZzyFufq8KQ.jpg"))
        listOfMovies.add(Movie("te","A fictional history of two legendary revolutionaries' journey away from home before they began fighting for their country in the 1920s.","/d3l7kgFJyLTTQSrR4ysCk5yeVyW.jpg"))

        val rvMovie = findViewById<RecyclerView>(R.id.rv_movies)
        val rvMovieAdapter = MovieListAdapter(){}

        rvMovie.adapter = rvMovieAdapter
        rvMovieAdapter.setNewItem(listOfMovies)


        rvMovie.layoutManager = GridLayoutManager(this, 2)
    }
}