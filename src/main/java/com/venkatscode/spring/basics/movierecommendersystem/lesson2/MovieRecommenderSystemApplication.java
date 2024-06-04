package com.venkatscode.spring.basics.movierecommendersystem.lesson2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//create object of RecommenderImplementation class
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		//display results
		System.out.println(Arrays.toString(result));
	}

}
