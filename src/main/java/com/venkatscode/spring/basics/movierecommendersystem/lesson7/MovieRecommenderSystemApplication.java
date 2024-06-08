package com.venkatscode.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//System.out.println("Constructor injection in RecommenderImplementation Class");
		System.out.println("Setter based injection in RecommenderImplementation2 Class");
		//create object of RecommenderImplementation class
		RecommenderImplementation2 recommender = appContext.getBean(RecommenderImplementation2.class);
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		//display results
		System.out.println(Arrays.toString(result));
	}

}
