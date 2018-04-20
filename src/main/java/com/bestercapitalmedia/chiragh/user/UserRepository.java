package com.bestercapitalmedia.chiragh.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Chiraghuser, Integer> {

	@Query(value = "select * from Chiraghuser where user_Name=?1 AND user_Password=?2 ", nativeQuery = true)
	public Chiraghuser findByUserNameNPassword(String userName,String userPassword);
		
	@Query(value = "select * from Chiraghuser where user_Email=?1  ", nativeQuery = true)
	public Chiraghuser findByEmail(String email);
	
	@Query(value = "select * from Chiraghuser where user_Name=?1  ", nativeQuery = true)
	public Chiraghuser findByUserName(String userName);

	@Query(value = "select * from Chiraghuser where token=?1  ", nativeQuery = true)
	public Chiraghuser findByToken(String token);
		
}
