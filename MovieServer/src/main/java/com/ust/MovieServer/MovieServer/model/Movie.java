package com.ust.MovieServer.MovieServer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {
    private int id;
    private String title;
    private int duration;
    private String genre;
    private String rating;

    public Movie(){}

    public Movie(@JsonProperty("id") int id,
                 @JsonProperty("title") String title,
                 @JsonProperty("duration") int duration,
                 @JsonProperty("genre") String genre,
                 @JsonProperty("rating") String rating) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
