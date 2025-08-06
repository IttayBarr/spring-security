package org.ittayb.springsecurity.service;

import org.ittayb.springsecurity.models.User;
import org.ittayb.springsecurity.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User register(User user) {
        return  userRepo.save(user);
    }
}
