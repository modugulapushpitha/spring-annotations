package com.stackroute.domain;

public class Movie {
    private String mname;
    private Actor actor;
    public void setMname(String mname){
        this.mname=mname;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }
    public void displaydemo() {
        System.out.println("Movie:" + mname);
        actor.display();
    }

}
