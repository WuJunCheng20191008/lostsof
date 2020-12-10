package com.demon.mongodb.controller;

import com.demon.mongodb.entity.User;
import com.demon.mongodb.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("insert")
    public void insert() {
//
        userRepository.deleteAll();

        userRepository.save(new User(1L, "demon", 1));
        userRepository.save(new User(2L, "demon2", 2));
        userRepository.save(new User(3L, "demon3", 3));

        User one = (User) userRepository.findById(1L).get();

        userRepository.delete(one);

        List<User> all = userRepository.findAll();

        System.out.println(all);
    }
}
