package com.dvdstore.dvd.store.repository.file;

import com.dvdstore.dvd.store.entity.Movie;
import com.dvdstore.dvd.store.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {
@Value("${movies.file.location}")
private File file;
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

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

    public List<Movie> list() {

        List<Movie> movies=new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {
                final Movie movie=new Movie();
                final String[] titreEtGenre = line.split("\\;");
                movie.setTitle(titreEtGenre[0]);
                movie.setGenre(titreEtGenre[1]);
                movies.add(movie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }


}
