package com.mycompany.dvd.service;

import com.mycompany.dvd.entity.Movie;

import java.util.List;
public interface MovieServiceInterface {

    void registerMovie (Movie movie);
List<Movie> getMovieList();

}
