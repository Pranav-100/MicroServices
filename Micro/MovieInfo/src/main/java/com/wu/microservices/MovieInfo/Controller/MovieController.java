package com.wu.microservices.MovieInfo.Controller;

import com.wu.microservices.MovieInfo.Repository.MovieService;
import com.wu.microservices.MovieInfo.entity.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;
    @GetMapping("/getById/{id}")
    public MovieInfo getInfo(@PathVariable int id)
    {
        return movieService.getMovieInfo(id);
    }

    @GetMapping("/getMovies")
    public List<MovieInfo> getInfo()
    {
        return movieService.getAllMovieInfo();
    }
}
