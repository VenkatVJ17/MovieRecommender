package com.venkatscode.spring.basics.movierecommendersystem.lesson13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		//ApplicationContext manages the beans and dependencies
		//ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);
		//use ApplicationContext to get recommender object
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		System.out.println();
		System.out.println();
		System.out.println(recommender);

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(result));
	}
}
