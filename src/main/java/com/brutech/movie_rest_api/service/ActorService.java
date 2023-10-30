package com.brutech.movie_rest_api.service;

import com.brutech.movie_rest_api.entity.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> getAllActors();
    Actor getActorById(long id);
    Actor saveActor(Actor actor);
    Actor deleteActor(long id);
}
