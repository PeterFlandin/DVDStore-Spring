package com.dvdstore.dvd.store.service;

import com.dvdstore.dvd.store.entity.Movie;

import java.util.List;
public interface MovieServiceInterface {

    void registerMovie (Movie movie);
List<Movie> getMovieList();

}
