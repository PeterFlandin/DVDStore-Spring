package com.mycompany.dvd.repository;

import com.mycompany.dvd.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {

    void add(Movie movie);

    List<Movie> list();


}
