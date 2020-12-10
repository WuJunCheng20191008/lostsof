package com.demon.ehcache.mapper;

import com.demon.ehcache.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User getUserById(Integer id);
}
