package com.venkatscode.spring.basics.movierecommendersystem.lesson2;

public class CollaborativeFilter implements Filter{
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
