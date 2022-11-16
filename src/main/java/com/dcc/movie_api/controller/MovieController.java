package com.dcc.movie_api.controller;

import com.dcc.movie_api.data.Movie;
import com.dcc.movie_api.service.MovieService;
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
    public List<Movie> findMovieByGenre(@PathVariable String genre) {
        return movieService.getByGenre(genre);
    }

    @GetMapping("/findByName/{name}")
    public List<Movie> findMovieByName(@PathVariable String name) {
        return movieService.getByName(name);
    }
//    @PutMapping("/updateById/{id}")
//    public Movie updateMovieById(@PathVariable Integer id, @RequestBody) {
//        return movieService.updateById(id);

    @DeleteMapping("/deleteById/{id}")
        public Movie deleteMovieById(@PathVariable Integer id) {
            return movieService.getById(id);
        }

//    @PutMapping("/employees/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
//            @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
//                      .orElseThrow(() -> new ("Employee not found for this id :: " + employeeId));

}



