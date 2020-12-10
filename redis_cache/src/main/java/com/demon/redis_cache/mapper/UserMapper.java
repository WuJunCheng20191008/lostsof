package com.demon.redis_cache.mapper;

import com.demon.redis_cache.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User  getUserById(Integer id);

    public void updateUser(User user);
}
