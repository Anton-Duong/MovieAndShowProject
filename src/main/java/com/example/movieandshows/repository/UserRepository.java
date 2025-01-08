package com.example.movieandshows.repository;

import com.example.movieandshows.model.User;
import com.example.movieandshows.model.UserEmbeddedID;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, UserEmbeddedID> {
  Optional<User> findByUserIdentifier_Email(String email);
  Optional<User> findByUserIdentifier_Username(String username);
}
