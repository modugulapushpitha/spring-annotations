package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        Movie movie=context.getBean("movie", Movie.class);
        System.out.println(movie);
        movie.displaydemo();
    }
}
