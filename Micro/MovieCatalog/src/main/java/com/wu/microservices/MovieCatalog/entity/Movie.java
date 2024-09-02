package com.wu.microservices.MovieCatalog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MOVIE")
public class Movie {
//    @Id
    @Column(name="ID")
    private int id;

    @Id
    @Column(name="MOVIE_NAME")
    private String movieName;

    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="RATING")
    private int rating;

    public Movie(){}
    public Movie(int id, String movieName, String description, int rating) {
        this.id = id;
        this.movieName = movieName;
        this.description = description;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
