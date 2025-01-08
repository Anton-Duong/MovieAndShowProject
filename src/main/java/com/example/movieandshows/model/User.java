package com.example.movieandshows.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;

@Entity
@IdClass(UserEmbeddedID.class)
public class User {
  @EmbeddedId
  UserEmbeddedID userIdentifier;

  @Getter
  @Setter
  private String password;

  @Getter
  @Setter
  private int age;
}
