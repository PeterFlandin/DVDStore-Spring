package com.mycompany.dvd.service;

import com.mycompany.dvd.entity.Movie;
import com.mycompany.dvd.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface {

   private MovieRepositoryInterface movieRepositoryInterface;

    public MovieRepositoryInterface getMovieRepositoryInterface() {
        return movieRepositoryInterface;
    }

    public void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }

    public void registerMovie (Movie movie){

        movieRepositoryInterface.add(movie);

    }


}
