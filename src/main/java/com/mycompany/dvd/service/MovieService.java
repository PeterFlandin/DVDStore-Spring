package com.mycompany.dvd.service;

import com.mycompany.dvd.entity.Movie;
import com.mycompany.dvd.repository.GoLiveMovieRepository;
import com.mycompany.dvd.repository.MovieRepository;

public class MovieService implements  MovieServiceInterface {

    private GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();

    public void registerMovie (Movie movie){

        movieRepository.add(movie);

    }


}
