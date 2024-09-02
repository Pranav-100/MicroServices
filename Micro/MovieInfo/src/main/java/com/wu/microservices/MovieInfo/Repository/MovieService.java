package com.wu.microservices.MovieInfo.Repository;

import com.wu.microservices.MovieInfo.entity.MovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovieService{
    public MovieInfo getMovieInfo(int id);

    List<MovieInfo> getAllMovieInfo();
}

