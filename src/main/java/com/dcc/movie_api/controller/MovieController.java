package com.dcc.movie_api.controller;

import com.dcc.movie_api.data.Movie;
import com.dcc.movie_api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Like urls, define routes here
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    //Requests come here first
    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);

    }

}

//Movie object sent with RequestBody-- as a POST request to "/addMovie" -- adds movie into DB

