package com.wu.microservices.MovieInfo.service;

import com.wu.microservices.MovieInfo.Repository.JPA;
import com.wu.microservices.MovieInfo.Repository.MovieService;
import com.wu.microservices.MovieInfo.entity.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    JPA jpa;
    public MovieInfo getMovieInfo(int id)
    {
        return jpa.findById(id);
    }

    public List<MovieInfo> getAllMovieInfo(){
        return jpa.findAll();
    }
}
