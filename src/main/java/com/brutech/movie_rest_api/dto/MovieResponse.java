package com.brutech.movie_rest_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class MovieResponse {
    private int id;
    private String title;
    private List<ActorResponse> actors;

    public MovieResponse(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
