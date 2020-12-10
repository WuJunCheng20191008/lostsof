package com.demon.ehcache.service;

import com.demon.ehcache.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "users")
public interface UserService {
    @Cacheable
    public User getUserById(Integer id);
}
