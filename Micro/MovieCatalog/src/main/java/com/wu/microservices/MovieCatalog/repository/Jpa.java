package com.wu.microservices.MovieCatalog.repository;

import com.wu.microservices.MovieCatalog.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Jpa extends JpaRepository<Movie,String> {
    public Optional<Movie> findById(String Name);
}
