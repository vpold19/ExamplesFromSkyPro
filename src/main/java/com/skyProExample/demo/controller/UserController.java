package com.skyProExample.demo.controller;

import com.skyProExample.demo.entity.User;
import com.skyProExample.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Void> createUSer(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/users/name/{name}")
    public ResponseEntity<List<User>> getUsersByName(@PathVariable ("name") String name){
       List<User> users = userService.getUsersByName(name);
        return ResponseEntity.ok(users);
    }
}
