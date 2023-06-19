package com.mycompany.dvd;

import com.mycompany.dvd.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvd.controller", "com.mycompany.dvd.service", "com.mycompany.dvd.repository.file"})
@ImportResource("classpath:applicationContext.xml")
@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
            
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MovieController movieController =  context.getBean(MovieController.class);


        movieController.addUsingControle();


    }
}
