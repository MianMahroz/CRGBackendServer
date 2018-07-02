package com.bestercapitalmedia.chiragh.oauth.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bestercapitalmedia.chiragh.oauth.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserDao.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
    
    /**
     * Find by username.
     *
     * @param username the username
     * @return the user
     */
    User findByUsername(String username);
}
