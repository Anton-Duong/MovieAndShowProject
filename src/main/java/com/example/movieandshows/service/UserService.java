package com.example.movieandshows.service;

import com.example.movieandshows.model.User;

import java.util.List;

public interface UserService {
  User saveUser (User user);

  void deleteUser(User user);

  List<User> allUsers();

}
