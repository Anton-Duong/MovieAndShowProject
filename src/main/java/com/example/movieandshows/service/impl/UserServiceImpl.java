package com.example.movieandshows.service.impl;

import com.example.movieandshows.model.User;
import com.example.movieandshows.repository.UserRepository;
import com.example.movieandshows.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  UserRepository userRepo;
  @Override
  public User saveUser(User user) {
    return userRepo.save(user);
  }

  @Override
  public void deleteUser(User user) {
    userRepo.delete(user);
  }

  @Override
  public List<User> allUsers() {
    return (List<User>) userRepo.findAll();
  }


}
