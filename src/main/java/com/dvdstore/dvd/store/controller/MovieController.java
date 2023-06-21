package com.dvdstore.dvd.store.controller;

import com.dvdstore.dvd.store.entity.Movie;
import com.dvdstore.dvd.store.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
@Controller
public class MovieController {
    @Autowired
    private MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    public void addUsingControle() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nom du film à creer ?");
        String titleM = sc.nextLine();

        System.out.println("Nom du genre à creer ?");
        String genreM = sc.nextLine();

        Movie movie = new Movie();
        movie.setTitle(titleM);
        movie.setGenre(genreM);

        movieServiceInterface.registerMovie(movie);


        System.out.println( "Hello World!" );

    }



}
