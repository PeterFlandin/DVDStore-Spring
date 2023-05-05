package com.mycompany.dvd.repository;

import com.mycompany.dvd.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements MovieRepositoryInterface {

private  static List<Movie> movies = new ArrayList<>();


public void add(Movie movie){

    movies.add(movie);
    System.out.println("movie added " + movie.getTitle()+ " de type " + movie.getGenre());


}



}
