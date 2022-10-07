package com.example.recycle_example.movie_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle_example.R
import com.example.recycle_example.data.MovieModel


class MovieAdapter(
    private val movieList: MutableList<MovieModel>,
    private val listener: MovieListener
) :
    RecyclerView.Adapter<MovieAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.movie_list, parent, false)
        return BooksViewHolder(view)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bind(movieList[position], listener)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class BooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val movieName = view.findViewById<TextView>(R.id.rvMovieName)
        private val movieGenre = view.findViewById<TextView>(R.id.rvMovieGenre)
        private val movierating = view.findViewById<TextView>(R.id.rvMovieRating)
        private val image=view.findViewById<ImageView>(R.id.imageview)

        fun bind(movie: MovieModel, listener: MovieListener) {
            movieName.text = movie.id
            movierating.text = movie.myRating
            movieGenre.text = movie.movieName

            val id = itemView.resources.getIdentifier("movie_${movie.id}", "drawable", itemView.context.packageName)
            val drawable = ResourcesCompat.getDrawable(itemView.resources, id, itemView.context.theme)
            image.setImageDrawable(drawable)

            itemView.setOnClickListener {
                listener.onClicked(movie)
            }

        } }
        interface MovieListener {
            fun onClicked(movie: MovieModel)
        } }