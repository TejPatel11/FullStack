package com.ust.MovieServer.MovieServer.service;

import com.ust.MovieServer.MovieServer.dao.MovieDao;
import com.ust.MovieServer.MovieServer.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieDao movieDao;

    @Autowired
    public MovieService(@Qualifier("MovieRepository") MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public int insertMovie(int id, Movie movie) {

        return movieDao.insertMovie(id, movie);
    }

    public int insertMovie(Movie movie) {
        return movieDao.insertMovie(movie);

    }

    public int updateMovie(int id, Movie movie) {
        return movieDao.updateMovie(id, movie);
    }

    public int deleteMovie(int id) {
        return movieDao.deleteMovie(id);
    }

    public List<Movie> queryMovie() {
        return movieDao.queryMovie();
    }

    public Optional<Movie> queryMovie(int id){
        return movieDao.queryMovie(id);
    }
}