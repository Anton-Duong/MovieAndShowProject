package com.example.movieandshows;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class MovieandshowsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieandshowsApplication.class, args);
	}

}
