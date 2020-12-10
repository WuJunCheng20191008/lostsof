package com.demon.log4jprofiles.mapper;

import com.demon.log4jprofiles.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User getUserById(Integer id);
}
