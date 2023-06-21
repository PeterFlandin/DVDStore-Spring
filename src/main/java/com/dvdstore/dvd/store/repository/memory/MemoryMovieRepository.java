package com.dvdstore.dvd.store.repository.memory;

import com.dvdstore.dvd.store.entity.Movie;
import com.dvdstore.dvd.store.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

private static List<Movie> movies = new ArrayList<>();


public void add(Movie movie){

    movies.add(movie);
    System.out.println("movie added " + movie.getTitle()+ " de type " + movie.getGenre());

}
    @Override
    public List<Movie> list() {
    return movies;
    }


}
