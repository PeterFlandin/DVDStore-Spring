package com.mycompany.dvd;

import com.mycompany.dvd.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
            
    {

        //ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context = SpringApplication.run(App.class, args);

        MovieController movieController =  context.getBean(MovieController.class);


        movieController.addUsingControle();


    }
}
