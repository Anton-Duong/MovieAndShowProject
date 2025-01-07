package com.example.movieandshows.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@IdClass(UserEmbeddedID.class)
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movieId;

    @Getter
    @Setter
    private String movieName;

    @Getter
    @Setter
    private int duration;

    @ManyToOne
    @JoinColumn(name = "review_id", referencedColumnName = "id")
    @Getter
    @Setter
    private Reviews review;
}
