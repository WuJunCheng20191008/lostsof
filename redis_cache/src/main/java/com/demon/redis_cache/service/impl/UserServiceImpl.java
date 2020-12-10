package com.demon.redis_cache.service.impl;

import com.demon.redis_cache.entity.User;
import com.demon.redis_cache.mapper.UserMapper;
import com.demon.redis_cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "users")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    @Cacheable(key = "#p0")
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
    @Override
    @CachePut(key = "#p0.id")
    public User updateUser(User user) {
        userMapper.updateUser(user);
        return userMapper.getUserById(user.getId());
    }
}
