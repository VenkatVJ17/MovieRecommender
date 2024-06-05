package com.venkatscode.spring.basics.movierecommendersystem.lesson3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//create object of RecommenderImplementation class
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		//display results
		System.out.println(Arrays.toString(result));
	}

}
