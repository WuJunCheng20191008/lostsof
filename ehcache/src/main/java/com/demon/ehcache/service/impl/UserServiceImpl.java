package com.demon.ehcache.service.impl;

import com.demon.ehcache.entity.User;
import com.demon.ehcache.mapper.UserMapper;
import com.demon.ehcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
