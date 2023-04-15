package com.mycompany.dvd;

import com.mycompany.dvd.entity.Movie;
import com.mycompany.dvd.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
            
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nom du film à creer ?");
        String titleM = sc.nextLine();

        System.out.println("Nom du film à creer ?");
        String genreM = sc.nextLine();

        Movie movie = new Movie();
        movie.setTitle(titleM);
        movie.setGenre(genreM);

        MovieService movieService = new MovieService();
        movieService.addMovie(movie);


        System.out.println( "Hello World!" );
    }
}
