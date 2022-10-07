package com.example.recycle_example.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.recycle_example.R
import com.example.recycle_example.data.MovieModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class MovieDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var theMovieName:TextView
    private lateinit var theMovieDescription:TextView
    private lateinit var theMovieGenre:TextView
    private lateinit var myRating:TextView




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_detail, container, false)

    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpView(view)
    }

    private fun setUpView(view:View){

        theMovieName=view.findViewById(R.id.theMovieName)
        theMovieGenre=view.findViewById(R.id.theMovieGenre)
        theMovieDescription=view.findViewById(R.id.theMovieDescrip)
        myRating=view.findViewById(R.id.theMR)




                arguments?.let {
                    val movieJson=it.getString("movieModel")
                   movieJson?.let {
                       val movie=MovieModel.fromJson(movieJson)

                       theMovieGenre.text=movie.movieGenre
                       theMovieDescription.text=movie.description
                       myRating.text=movie.myRating
                       theMovieName.text=movie.movieName

                   }
                }

            }
    }
