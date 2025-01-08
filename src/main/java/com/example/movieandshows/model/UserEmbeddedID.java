package com.example.movieandshows.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
public class UserEmbeddedID implements Serializable {
  @Getter
  @Setter
  private String email;
  @Getter
  @Setter
  private String username;
}
