package com.demon.mybatis.service.impl;

import com.demon.mybatis.entity.User;
import com.demon.mybatis.mapper.UserMapper;
import com.demon.mybatis.service.UserService;
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
