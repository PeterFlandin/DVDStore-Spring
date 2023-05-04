package com.mycompany.dvd;

import com.mycompany.dvd.controller.MovieController;
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

        MovieController movieController = new MovieController();

        movieController.addUsingControle();



    }
}
