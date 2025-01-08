package com.example.movieandshows.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewID;

    @Getter
    @Setter
    private String reviewComment;

    @Getter
    @Setter
    private int rating;
}
