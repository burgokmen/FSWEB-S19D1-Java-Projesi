package com.brutech.movie_rest_api.service;

import com.brutech.movie_rest_api.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie getMovieById(long id);
    Movie saveMovie(Movie movie);
    Movie deleteMovie(long id);

}
