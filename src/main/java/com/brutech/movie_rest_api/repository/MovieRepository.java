package com.brutech.movie_rest_api.repository;

import com.brutech.movie_rest_api.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
