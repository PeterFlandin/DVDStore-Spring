package com.dvdstore.dvd.store.repository;

import com.dvdstore.dvd.store.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {

    void add(Movie movie);

    List<Movie> list();


}
