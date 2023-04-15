package com.mycompany.dvd.repository;

import com.mycompany.dvd.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

private  static List<Movie> movies = new ArrayList<>();


public void create(Movie movie){

    movies.add(movie);
    System.out.println("movie added " + movie.getTitle()+ " de type " + movie.getGenre());


}



}
