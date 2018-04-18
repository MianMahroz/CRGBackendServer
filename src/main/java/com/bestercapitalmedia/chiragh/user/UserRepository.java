package com.bestercapitalmedia.chiragh.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ChiraghUser, Integer> {

	@Query(value = "select * from Chiragh_User where user_Name=?1 AND user_Password=?2 ", nativeQuery = true)
	public ChiraghUser findByUserNameNPassword(String userName,String userPassword);
		
	@Query(value = "select * from Chiragh_User where user_Email=?1  ", nativeQuery = true)
	public ChiraghUser findByEmail(String email);
	
	
}
