package com.venkatscode.spring.basics.movierecommendersystem.lesson16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//use ApplicationContext to get recommender object
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		System.out.println();
		System.out.println();
		System.out.println(recommender);

		//display value read from external property file
		String favoriteMovie = recommender.returnFavoriteMovie();
		System.out.println(favoriteMovie);
		//call method to get recommendations
		String[] result = recommender.recommendMovies(favoriteMovie);

		//display results
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(result));
	}
}
