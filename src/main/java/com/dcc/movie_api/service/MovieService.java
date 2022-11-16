package com.dcc.movie_api.service;

import com.dcc.movie_api.data.Movie;
import com.dcc.movie_api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MovieService {


    @Autowired
    private MovieRepository movieRepository;

    //Methods

    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

//
    public Movie getById(Integer id){
        return movieRepository.findById(id).orElse(null);
    }

    public List<Movie> getByGenre(String genre){
        return movieRepository.findByGenre(genre);
    }

    public Movie getByName(String name){
        return movieRepository.findByName(name);
    }

    public void deleteById(Integer id){
       movieRepository.deleteById(id);
    }

    public void updateMovieById(@PathVariable Integer id) {
    }

    @PutMapping("/updateById/{id}")
    public Movie updateMovieById(@PathVariable Integer id, @RequestBody Movie movie) {
        Movie updateMovie = movieRepository.findById(id).get();
        updateMovie.setId(movie.getId());
        updateMovie.setName(movie.getName());
        updateMovie.setGenre(movie.getGenre());
        updateMovie.setDirector(movie.getDirector());

        return movieRepository.save(updateMovie);
      }
}