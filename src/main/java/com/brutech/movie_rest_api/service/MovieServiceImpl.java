package com.brutech.movie_rest_api.service;

import com.brutech.movie_rest_api.entity.Movie;
import com.brutech.movie_rest_api.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieRepository MovieRepository;
    @Autowired
    public MovieServiceImpl(com.brutech.movie_rest_api.repository.MovieRepository movieRepository) {
        MovieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies() {
        return MovieRepository.findAll();
    }

    @Override
    public Movie getMovieById(long id) {
        Optional<Movie> movieOptional = MovieRepository.findById(id);
        if(movieOptional.isPresent()){
            return movieOptional.get();
        }
       throw new RuntimeException("Movie not found");
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return MovieRepository.save(movie);
    }

    @Override
    public Movie deleteMovie(long id) {
        Movie movie = getMovieById(id);
        MovieRepository.delete(movie);
        return movie;
    }
}
