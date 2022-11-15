package com.dcc.movie_api.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
// Creating a model

@Entity
public class Movie {
    //Instance variables (made private)
    @Id
    @GeneratedValue
        private Integer id;
        private String name;
        private String genre;
        private String director;

//Constructor without parameters
    public Movie() {
    }


//Constructor with parameters
    public Movie(Integer id, String name, String genre, String director) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.director = director;
    }

// Getters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }


//Setters


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
