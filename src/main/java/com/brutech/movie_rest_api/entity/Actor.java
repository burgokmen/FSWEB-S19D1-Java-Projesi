package com.brutech.movie_rest_api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "actor", schema = "fsweb")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "birth_date")
    private String birthDate;

    @ManyToMany
    @JoinTable(name = "movie_actor", schema = "fsweb",
            joinColumns = @JoinColumn(name = "actor_id" ),
            inverseJoinColumns = @JoinColumn(name =  "movie_id"))
    private List<Movie> movies;

    public void addMovie(Movie movie) {
        if(movies == null) {
            movies = new ArrayList<Movie>();
        }
        movies.add(movie);
    }
}
