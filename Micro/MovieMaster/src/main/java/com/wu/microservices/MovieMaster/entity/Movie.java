package com.wu.microservices.MovieMaster.entity;

public class Movie {
    private int id;

    private String movieName;

    private String description;

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
