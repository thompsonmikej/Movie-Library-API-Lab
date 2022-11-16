package com.dcc.movie_api.controller;

import com.dcc.movie_api.data.Movie;
import com.dcc.movie_api.service.MovieService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Like urls, define routes here
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;


    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @GetMapping("/movies")
    public List<Movie> findAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    public Movie findMovieById(@PathVariable Integer id) {
        return movieService.getById(id);
    }

    @GetMapping("/findByGenre/{genre}")
    public List<Movie> findMoviesByGenre(@PathVariable String genre) {
        return movieService.getByGenre(genre);
    }

    @GetMapping("/findByName/{name}")
    public Movie findMovieByName(@PathVariable String name) {
        return movieService.getByName(name);
    }

    @PutMapping("/updateById/{id}")
    public Movie updateMovieById(@PathVariable Integer id, @RequestBody Movie movie) {
        //Finding movie on db, saving as variable
        Movie updateMovie = movieService.getById(id);
        updateMovie.setId(movie.getId());
        updateMovie.setName(movie.getName());
        updateMovie.setGenre(movie.getGenre());
        updateMovie.setDirector(movie.getDirector());
        movieService.saveMovie(updateMovie);

        return updateMovie;
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteMovieById(@PathVariable Integer id) {
        movieService.getById(id);
    }

}

