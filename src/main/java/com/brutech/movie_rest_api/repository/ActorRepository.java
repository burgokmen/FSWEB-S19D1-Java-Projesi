package com.brutech.movie_rest_api.repository;

import com.brutech.movie_rest_api.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
