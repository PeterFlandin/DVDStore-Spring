package com.mycompany.dvd;

import com.mycompany.dvd.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
            
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieController movieController =  context.getBean(MovieController.class);


        movieController.addUsingControle();


    }
}
