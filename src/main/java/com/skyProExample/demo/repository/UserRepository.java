package com.skyProExample.demo.repository;

import com.skyProExample.demo.entity.User;
import io.swagger.v3.oas.models.links.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> getUsersByName(String name);
}
