package com.wu.microservices.MovieInfo.Repository;

import com.wu.microservices.MovieInfo.entity.MovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface JPA extends JpaRepository<MovieInfo, Integer> {
    public List<MovieInfo> findAll();
    public MovieInfo findById(int id);
}
