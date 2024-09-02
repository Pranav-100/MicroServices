package com.wu.microservices.MovieInfo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="MOVIEINFO")
public class MovieInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_info_seq")
    @SequenceGenerator(name = "movie_info_seq", sequenceName = "movie_info_id_seq", allocationSize = 1)
    @Column(name="MOVIE_ID")
    private int id;

    @Column(name="MOVIE_NAME")
    private String name;

    public MovieInfo() {
    }
    public MovieInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MovieInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
