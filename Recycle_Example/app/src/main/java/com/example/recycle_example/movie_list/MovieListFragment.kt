package com.example.recycle_example.movie_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle_example.R
import com.example.recycle_example.data.MovieModel
import com.example.recycle_example.data.mockMovieData


class MovieListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var rvMovieList: RecyclerView
    private lateinit var navcontroller:NavController




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    navcontroller=findNavController()
    rvMovieList=view.findViewById(R.id.rvBookList)
    setupAdapter()
}
    private fun setupAdapter(){

       rvMovieList.adapter=MovieAdapter(mockMovieData.toMutableList(), object : MovieAdapter.MovieListener{
           override fun onClicked(movie: MovieModel) {

               navcontroller.navigate(R.id.action_movieListFragment_to_movieDetailFragment,Bundle().apply {
                   putString("movieModel",movie.toJson())
               } )
           }
       })
    }

    }




