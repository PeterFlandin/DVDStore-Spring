package com.mycompany.dvd.service;

import com.mycompany.dvd.entity.Movie;
import com.mycompany.dvd.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();


    public void addMovie(Movie movie){

        movieRepository.create(movie);

    }


}
