package com.krtcd.service;

import java.util.Optional;

import com.krtcd.model.User;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User saveUser(User user);

}
