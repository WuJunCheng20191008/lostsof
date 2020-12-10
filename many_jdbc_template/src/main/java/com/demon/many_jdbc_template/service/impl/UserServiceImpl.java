package com.demon.many_jdbc_template.service.impl;

import com.demon.many_jdbc_template.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate primaryJdbcTemplate;
    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    private JdbcTemplate secondaryJdbcTemplate;

    @Override
    public void insertToTest1(String name, Integer age) {
        primaryJdbcTemplate.update("insert into user(name,age) values(?,?)",name,age);
    }

    @Override
    public void insertToTest2(String name, Integer age) {
        secondaryJdbcTemplate.update("insert into user(name,age) values(?,?)",name,age);
    }
}
