package com.brutech.movie_rest_api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "movie", schema = "fsweb")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "directed_by")
    private String directedBy;

    @Column(name = "rating")
    private double rating;

    @Column(name = "release_date")
    private Date releaseDate;

    @ManyToMany
    @JoinTable(name = "movie_actor", schema = "fsweb",
    joinColumns = @JoinColumn(name = "movie_id"),
    inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private List<Actor> actors;

    public void addActor(Actor actor) {
        if(actors == null) {
            actors = new ArrayList<Actor>();
        }
        actors.add(actor);
    }

}
