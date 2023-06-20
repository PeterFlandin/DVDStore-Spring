package com.mycompany.dvd.repository.memory;

import com.mycompany.dvd.entity.Movie;
import com.mycompany.dvd.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

private  static List<Movie> movies = new ArrayList<>();


public void add(Movie movie){

    movies.add(movie);
    System.out.println("movie added " + movie.getTitle()+ " de type " + movie.getGenre());


}



}
