package com.bestercapitalmedia.chiragh.oauth.service.impl;

import com.bestercapitalmedia.chiragh.oauth.dao.UserDao;
import com.bestercapitalmedia.chiragh.oauth.model.User;
import com.bestercapitalmedia.chiragh.oauth.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class UserServiceImpl.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

	/** The user dao. */
	@Autowired
	private UserDao userDao;

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
//		if(username.)

		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				getAuthority());

	}

	/**
	 * Gets the authority.
	 *
	 * @return the authority
	 */
	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	/* (non-Javadoc)
	 * @see com.bestercapitalmedia.chiragh.oauth.service.UserService#findAll()
	 */
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	/* (non-Javadoc)
	 * @see com.bestercapitalmedia.chiragh.oauth.service.UserService#delete(long)
	 */
	@Override
	public void delete(long id) {
		userDao.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.bestercapitalmedia.chiragh.oauth.service.UserService#save(com.bestercapitalmedia.chiragh.oauth.model.User)
	 */
	@Override
	public User save(User user) {
		return userDao.save(user);
	}
}
