package com.dvdstore.dvd.store.service;

import com.dvdstore.dvd.store.entity.Movie;
import com.dvdstore.dvd.store.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    @Autowired
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

    @Override
    public List<Movie> getMovieList() {
        return movieRepositoryInterface.list();
    }
}
