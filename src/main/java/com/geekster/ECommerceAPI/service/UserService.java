package com.geekster.ECommerceAPI.service;

import com.geekster.ECommerceAPI.model.User;
import com.geekster.ECommerceAPI.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public void createUsers(List<User> userList) {
        iUserRepo.saveAll(userList);
    }

    public Optional<User> getUserById(Long userId) {
        return iUserRepo.findById(userId);
    }
}
