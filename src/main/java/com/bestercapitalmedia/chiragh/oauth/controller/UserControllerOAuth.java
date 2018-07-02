package com.bestercapitalmedia.chiragh.oauth.controller;

import com.bestercapitalmedia.chiragh.oauth.model.User;
import com.bestercapitalmedia.chiragh.oauth.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class UserControllerOAuth.
 */
@RestController
@RequestMapping("/users")
public class UserControllerOAuth {

    /** The user service. */
    @Autowired
    private UserService userService;

    /**
     * List user.
     *
     * @return the list
     */
    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.findAll();
    }

    /**
     * Creates the.
     *
     * @param user the user
     * @return the user
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return userService.save(user);
    }

    /**
     * Delete.
     *
     * @param id the id
     * @return the string
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Long id){
        userService.delete(id);
        return "success";
    }

}
