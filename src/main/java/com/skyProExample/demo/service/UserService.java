package com.skyProExample.demo.service;

import com.skyProExample.demo.entity.User;
import com.skyProExample.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(Integer id) {
        return userRepository.getById(id);
    }

    public void deleteUserById(Integer id) {
        userRepository.getById(id);
    }

    public List<User> getUsersByName(String name){
        return userRepository.getUsersByName(name);
    }
}
