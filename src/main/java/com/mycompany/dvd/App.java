package com.mycompany.dvd;

import com.mycompany.dvd.controller.MovieController;
import com.mycompany.dvd.repository.FileMovieRepository;
import com.mycompany.dvd.service.DefaultMovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
            
    {

        MovieController movieController = new MovieController();

        FileMovieRepository goLiveMovieRepository = new FileMovieRepository();
        DefaultMovieService movieService = new DefaultMovieService();
movieController.setMovieServiceInterface(movieService);
movieService.setMovieRepositoryInterface(goLiveMovieRepository);

        movieController.addUsingControle();



    }
}
