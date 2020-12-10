package com.demon.mybatis.mapper;

import com.demon.mybatis.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User getUserById(Integer id);
}
