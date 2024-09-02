package com.wu.microservices.MovieCatalog.service;

import com.wu.microservices.MovieCatalog.entity.Movie;
import com.wu.microservices.MovieCatalog.repository.Jpa;
import com.wu.microservices.MovieCatalog.repository.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    Jpa jpa;
    public List<Movie> getMovieCatalog(){
        return jpa.findAll();
    }

    public Optional<Movie> getMovieByName(String Name){
        return jpa.findById(Name);
    }
}
