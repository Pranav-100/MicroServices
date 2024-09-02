package com.wu.microservices.MovieCatalog.repository;

import com.wu.microservices.MovieCatalog.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieService {
    public List<Movie> getMovieCatalog();
    public Optional<Movie> getMovieByName(String Name);
}
