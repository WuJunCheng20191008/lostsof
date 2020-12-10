package com.demon.flyway.service.impl;

import com.demon.flyway.entity.User;
import com.demon.flyway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Integer getUserById(Integer id) {
        return jdbcTemplate.queryForObject("select count(1) from user where id = ?",
                new Object[]{id}, Integer.class);
    }
}
