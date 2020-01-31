package com.cdac.irp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cdac.irp.pojos.Admin;

public interface IAdminDao extends JpaRepository<Admin, Integer>{
	
	@Query("Select a from Admin a WHERE a.email = :email and a.password = :password")
	public Admin Authenticate(String email, String password) throws Exception;

}
