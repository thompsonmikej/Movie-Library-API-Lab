package com.dcc.movie_api.service;

import com.dcc.movie_api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
// this give the service layer access to the repo

    @Autowired
    private MovieRepository movieRepository;

    //Methods
    // This will save the movie passed into this function
    // The parent will pass movie into this function to save into the DB
    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

}
