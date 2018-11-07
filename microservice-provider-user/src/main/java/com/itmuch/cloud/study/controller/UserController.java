package com.itmuch.cloud.study.controller;

import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: monkey
 * Date: 2018-11-06 11:15
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //GetMapping 是spring4.3提供的注解
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = userRepository.findOne(id);
        return user;
    }
}
