package com.bestercapitalmedia.chiragh.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
// TODO: Auto-generated Javadoc

/**
 * The Interface UserRepository.
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public interface UserRepository extends CrudRepository<Chiraghuser, Integer> {

	/**
	 * Find by user name N password.
	 *
	 * @param userName the user name
	 * @param userPassword the user password
	 * @return the chiraghuser
	 */
	@Query(value = "select * from Chiraghuser where user_Name=?1 AND user_Password=?2", nativeQuery = true)
	public Chiraghuser findByUserNameNPassword(String userName,String userPassword);
	
	/**
	 * Find admin user by user name N password N role.
	 *
	 * @param userName the user name
	 * @param userPassword the user password
	 * @param role the role
	 * @return the chiraghuser
	 */
	@Query(value = "select * from Chiraghuser where user_Name=?1 AND user_Password=?2  AND role=?3", nativeQuery = true)
	public Chiraghuser findAdminUserByUserNameNPasswordNRole(String userName,String userPassword,String role);
		
	
	@Query(value = "select * from Chiraghuser where user_Name=?1   AND role=?2", nativeQuery = true)
	public Chiraghuser findAdminUserByUserNameNRole(String userName,String role);
	/**
	 * Find by email.
	 *
	 * @param email the email
	 * @return the chiraghuser
	 */
	@Query(value = "select * from Chiraghuser where user_Email=?1  ", nativeQuery = true)
	public Chiraghuser findByEmail(String email);
	
	/**
	 * Find by user name.
	 *
	 * @param userName the user name
	 * @return the chiraghuser
	 */
	@Query(value = "select * from Chiraghuser where user_Name=?1  ", nativeQuery = true)
	public Chiraghuser findByUserName(String userName);

	/**
	 * Find by token.
	 *
	 * @param token the token
	 * @return the chiraghuser
	 */
	@Query(value = "select * from Chiraghuser where token=?1  ", nativeQuery = true)
	public Chiraghuser findByToken(String token);

	/**
	 * Find by user id.
	 *
	 * @param userId the user id
	 * @return the chiraghuser
	 */
	@Query(value = "select * from Chiraghuser where user_Id=?1  ", nativeQuery = true)
	public Chiraghuser findByUserId(int  userId);

	/**
	 * Find all user.
	 *
	 * @return the list
	 */
	@Query(value = "Select * from Chiraghuser;", nativeQuery = true)
	public List<Chiraghuser> findAllUser();
	
	/**
	 * Find user with complete properties.
	 *
	 * @return the list
	 */
	@Query(value = "SELECT * FROM chiraghUser WHERE User_Id=Any(SELECT USer_Id FROM Chiraghproperty WHERE Property_Status='complete')", nativeQuery = true)
	public List<Chiraghuser> findUserWithCompleteProperties();
	
}
