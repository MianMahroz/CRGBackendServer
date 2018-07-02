package com.bestercapitalmedia.chiragh.oauth.service;

import java.util.List;

import com.bestercapitalmedia.chiragh.oauth.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserService.
 */
public interface UserService {

    /**
     * Save.
     *
     * @param user the user
     * @return the user
     */
    User save(User user);
    
    /**
     * Find all.
     *
     * @return the list
     */
    List<User> findAll();
    
    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(long id);
}
