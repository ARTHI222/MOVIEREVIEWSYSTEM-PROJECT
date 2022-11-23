package com.MRS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.MRS.Model.Login;

@Repository
public interface Loginrepo extends JpaRepository<Login, Integer>{

	@Query(value="Select * from admin where email=?",nativeQuery = true)
	Login findbyemail(String email);

	@Query(value="Select * from Login where email=?",nativeQuery = true)
	Login findbyemailuser(String email);

	
}
