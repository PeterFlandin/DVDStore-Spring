package com.mycompany.dvd.controller;

import com.mycompany.dvd.entity.Movie;
import com.mycompany.dvd.service.MovieService;
import com.mycompany.dvd.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {
    private static MovieServiceInterface movieServiceInterface;

    public static void addUsingControle () {

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
