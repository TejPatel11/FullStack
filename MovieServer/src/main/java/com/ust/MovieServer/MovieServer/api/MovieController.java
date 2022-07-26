package com.ust.MovieServer.MovieServer.api;

import com.ust.MovieServer.MovieServer.model.Movie;
import com.ust.MovieServer.MovieServer.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="movies/")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping(value="",consumes = MediaType.APPLICATION_JSON_VALUE)
    int insertMovie(@RequestBody Movie movie){
        return movieService.insertMovie(movie);
    }

    @PutMapping(value = "{id}")
    int updateMovie(@PathVariable("id")int id, @RequestBody Movie movie){
        return movieService.updateMovie(id,movie);
    }

    @DeleteMapping(value="{id}")
    int deleteMovie(@PathVariable("id") int id){
        return movieService.deleteMovie(id);
    }
    @GetMapping
    List<Movie> queryMovie(){
        return movieService.queryMovie();
    }

    @GetMapping(value="{id}")
    Optional<Movie> queryMovie(@PathVariable("id")int id){
        return movieService.queryMovie(id);
    }
}
