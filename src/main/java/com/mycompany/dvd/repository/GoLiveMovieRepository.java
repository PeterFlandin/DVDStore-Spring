package com.mycompany.dvd.repository;

import com.mycompany.dvd.entity.Movie;

import java.io.FileWriter;

public class GoLiveMovieRepository implements MovieRepositoryInterface {


    public void add(Movie movie) {

        FileWriter writer;

        try{
            writer = new FileWriter("movies.txt", true);
            writer.write(movie.getTitle());
            writer.write("\n");
            writer.write(movie.getGenre());
            writer.write("\n");
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("The movie "+movie.getTitle()+" has been added.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
