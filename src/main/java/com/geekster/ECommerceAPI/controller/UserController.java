package com.geekster.ECommerceAPI.controller;

import com.geekster.ECommerceAPI.model.User;
import com.geekster.ECommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("users")
    public String createUsers(@RequestBody List<User> userList){
        userService.createUsers(userList);
        return "Users Added";
    }

    @GetMapping("user/{userId}/id")
    public Optional<User> getUserById(@PathVariable Long userId){

        return userService.getUserById(userId);
    }
}
