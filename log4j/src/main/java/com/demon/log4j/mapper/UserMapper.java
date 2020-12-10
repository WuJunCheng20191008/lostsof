package com.demon.log4j.mapper;

import com.demon.log4j.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User getUserById(Integer id);
}
