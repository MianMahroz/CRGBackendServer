package com.bestercapitalmedia.chiragh.propertyactivitylogs;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bestercapitalmedia.chiragh.property.Chiraghproperty;

public interface PropertyActivityLogsRepository extends CrudRepository<PropertyActivityLogs, Integer> {

	
	@Query(value = "select * from PropertyActivityLogs where property_Id=?1 AND task_Type='system'", nativeQuery = true)
	public PropertyActivityLogs getSystemGeneratedTaskByPropertyId(int propertyId);

	@Query(value = "select * from PropertyActivityLogs where  task_Type='user'", nativeQuery = true)
	public  List<PropertyActivityLogs> getUserGeneratedTask();


	@Query(value = "select * from PropertyActivityLogs where  task_Type='user' AND adminUserName=?1", nativeQuery = true)
	public  List<PropertyActivityLogs> getUserGeneratedTaskByUserName(String adminUserName);

}
