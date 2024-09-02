package com.wu.microservices.MovieCatalog.Controller;

import com.wu.microservices.MovieCatalog.entity.Movie;
import com.wu.microservices.MovieCatalog.repository.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    MovieService movieService;

    @GetMapping("/getMovies")
    public List<Movie> getMovieCatalog(){
        return movieService.getMovieCatalog();
    }

    @GetMapping("/getMovies/{name}")
    public Movie getMovieByName(@PathVariable String name){
        Optional<Movie> movie=movieService.getMovieByName(name);
        return movie.get();
    }
}
