package com.my.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *  http://localhost:8080/users/1          
 *  http://localhost:8080/users     (success)
 *  http://localhost:8080/users/3   ??      (404 error)
 */
@SpringBootApplication
public class SpringBootJerseyApp extends SpringBootServletInitializer
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//      SpringApplication.run(SpringBootJerseyApp.class, args);
        new SpringBootJerseyApp().configure(new SpringApplicationBuilder(SpringBootJerseyApp.class)).run(args);
    }
}