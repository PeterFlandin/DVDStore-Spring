package com.mycompany.dvd.controller;

import com.mycompany.dvd.entity.Movie;
import com.mycompany.dvd.service.MovieService;

import java.util.Scanner;

public class MovieController {
    private static MovieService movieService = new MovieService();

    public static void addUsingControle () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nom du film à creer ?");
        String titleM = sc.nextLine();

        System.out.println("Nom du genre à creer ?");
        String genreM = sc.nextLine();

        Movie movie = new Movie();
        movie.setTitle(titleM);
        movie.setGenre(genreM);

        movieService.addMovie(movie);


        System.out.println( "Hello World!" );

    }



}
