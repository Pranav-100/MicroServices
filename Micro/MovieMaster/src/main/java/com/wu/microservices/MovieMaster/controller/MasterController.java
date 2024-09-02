package com.wu.microservices.MovieMaster.controller;

//package com.wu.microservices.MasterServer.controller;

//import com.wu.microservices.MasterServer.entity.Movie;
//import com.wu.microservices.MasterServer.entity.MovieInfo;
import com.wu.microservices.MovieMaster.entity.Movie;
import com.wu.microservices.MovieMaster.entity.MovieInfo;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MasterController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/ping")
    public String pingCheck()
    {
        return "hello";
    }


    @GetMapping("/getMovies")
    public Movie getMoviefromName()
    {
        String url = "http://localhost:8585/getMovies/Interstellar";
        Movie movie = restTemplate.getForObject(url, Movie.class);

        return movie;
    }

    @GetMapping("/getAllMovies")
    public List<Movie> getMovies()
    {
        String url = "http://localhost:8585/getMovies";
        ResponseEntity<List<Movie>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>() {}
        );
        System.out.println(response.getBody());
        return response.getBody();
//        List<Movie> movie=( List<Movie>)restTemplate.getForObject(url,Movie.class);
//        return movie;
    }


    @GetMapping("/getMovieInfo")
    public MovieInfo getMovieInfo()
    {
        String url = "http://localhost:8787/getById/2";
        MovieInfo movieInfo = restTemplate.getForObject(url, MovieInfo.class);

        return movieInfo;
    }

}



