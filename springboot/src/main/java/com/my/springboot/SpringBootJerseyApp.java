package com.my.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *  http://localhost:8080/hello          (404 error)
 *  http://localhost:8080/v1/users/2     (success)
 *  http://localhost:8080/v1/1   ??      (404 error)
 */
@SpringBootApplication
@RestController
public class SpringBootJerseyApp 
{
	@RequestMapping("/hello")
    String hello() {
        return "Hello World!!!";
    }
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(SpringBootJerseyApp.class, args);
    }
}
