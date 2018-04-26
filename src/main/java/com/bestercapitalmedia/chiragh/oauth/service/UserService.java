package com.bestercapitalmedia.chiragh.oauth.service;

import java.util.List;

import com.bestercapitalmedia.chiragh.oauth.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
