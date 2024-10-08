package com.xmu.service;

import com.xmu.mapper.UserMapper;
import com.xmu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getAllUsers()
    {
        return userMapper.getAllUsers();
    }
}
