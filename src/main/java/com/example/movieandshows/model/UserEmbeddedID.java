package com.example.movieandshows.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class UserEmbeddedID {
  @Id
  @Getter
  @Setter
  private String email;
  @Id
  @Getter
  @Setter
  private String username;
}
