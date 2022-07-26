package com.ust.MovieServer.MovieServer.dao;

import com.ust.MovieServer.MovieServer.model.Movie;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public interface MovieDao {
    default int insertMovie(Movie movie){
        Random rand = new Random();
        int id = rand.nextInt();
        return insertMovie(id,movie);
    }
    int insertMovie(int id, Movie movie);
    int updateMovie(int id, Movie movie);
    int deleteMovie(int id);

    List<Movie> queryMovie();
    Optional<Movie> queryMovie(int id);

}
