package com.demon.log4j.service.impl;

import com.demon.log4j.entity.User;
import com.demon.log4j.mapper.UserMapper;
import com.demon.log4j.service.UserService;
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
