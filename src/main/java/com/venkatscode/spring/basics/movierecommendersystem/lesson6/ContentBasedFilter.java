package com.venkatscode.spring.basics.movierecommendersystem.lesson6;

import org.springframework.stereotype.Component;

@Component("CBF")
//@qualifier("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
