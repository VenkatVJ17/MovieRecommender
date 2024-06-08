package com.venkatscode.spring.basics.movierecommendersystem.lesson14;

import com.venkatscode.spring.basics.movierecommendersystem.lesson8.Filter;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
        super();
    }
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
