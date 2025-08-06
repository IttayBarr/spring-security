package org.ittayb.springsecurity.controllers;


import org.ittayb.springsecurity.models.User;
import org.ittayb.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        User registeredUser =  userService.register(user);
        return registeredUser;
    }

}
