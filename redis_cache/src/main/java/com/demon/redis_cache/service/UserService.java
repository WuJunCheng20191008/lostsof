package com.demon.redis_cache.service;

import com.demon.redis_cache.entity.User;


public interface UserService {

    public User getUserById(Integer id);

    public User updateUser(User user);
}
