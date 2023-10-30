package com.brutech.movie_rest_api.controller;

import com.brutech.movie_rest_api.dto.MovieResponse;
import com.brutech.movie_rest_api.entity.Movie;
import com.brutech.movie_rest_api.service.ActorService;
import com.brutech.movie_rest_api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private MovieService movieService;
    private ActorService actorService;

    @Autowired
    public MovieController(MovieService movieService, ActorService actorService) {
        this.movieService = movieService;
        this.actorService = actorService;
    }

    @GetMapping("/")
    public List<MovieResponse> getAllMovies(){
        List<Movie> movies = movieService.getAllMovies();


    }
}
