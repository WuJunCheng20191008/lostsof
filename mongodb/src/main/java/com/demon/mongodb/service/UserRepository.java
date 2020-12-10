package com.demon.mongodb.service;

import com.demon.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Long> {
    User findByUsername(String username);
}
