package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;

public class Config {
    @Bean
    public Actor actor()
    {
        Actor actor=new Actor();
        actor.setName("Yash");
        actor.setAge(40);
        actor.setGender("Male");
        return actor;
    }
    @Bean
    public Movie movie()
    {
        Movie movie =new Movie(actor());
        movie.setMname("KGF");
        return movie;
    }
}
