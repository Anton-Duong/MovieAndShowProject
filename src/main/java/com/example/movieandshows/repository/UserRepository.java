package com.example.movieandshows.repository;

import com.example.movieandshows.model.User;
import com.example.movieandshows.model.UserEmbeddedID;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, UserEmbeddedID> {
  User findbyIdOrEmail(UserEmbeddedID userUnique);
}
