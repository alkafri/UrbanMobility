package com.urbanmobility.controller;

import com.urbanmobility.model.User;
import com.urbanmobility.repository.UserRepository;
import com.urbanmobility.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            // Update user properties here
            existingUser.setUsername(user.getUsername());
            existingUser.setContactInformation(user.getContactInformation());
            existingUser.setPaymentInformation(user.getPaymentInformation());
            // Update other properties as needed
            return userRepository.save(existingUser);
        }
        return null; // User not found
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
