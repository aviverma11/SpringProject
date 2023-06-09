package com.user.controller;

import com.user.entity.User;
import com.user.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){
            return  this.userServices.getUser(userId);
    }

}
