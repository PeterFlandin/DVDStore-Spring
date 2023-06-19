package com.mycompany.dvd;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvd.controller", "com.mycompany.dvd.service", "com.mycompany.dvd.repository.file"})
@ImportResource("classpath:applicationContext.xml")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
