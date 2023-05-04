package com.mycompany.dvd.service;

import com.mycompany.dvd.entity.Movie;
import com.mycompany.dvd.repository.GoLiveMovieRepository;
import com.mycompany.dvd.repository.MovieRepository;

public class MovieService {

    private GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();

    public void addMovie(Movie movie){

        movieRepository.add(movie);

    }


}
