package com.example.demo.models;

import java.util.List;

public class Movies {

    private Long id;
    private String movieName;
    private String MovieType;//suggested or original
    private List<Category> category;

    public Movies() {

    }

    public Movies(String movieName, String movieType, List<Category> category) {
        this.movieName = movieName;
        MovieType = movieType;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return MovieType;
    }

    public void setMovieType(String movieType) {
        MovieType = movieType;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", MovieType='" + MovieType + '\'' +
                ", category=" + category +
                '}';
    }
}


