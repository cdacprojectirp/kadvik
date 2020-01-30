package com.cdac.irp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.irp.dao.IAdminDao;

@Service
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private IAdminDao jpa;

	@Override
	public Boolean Authenticate(String email, String password) {

		if(jpa.Authenticate(email, password) != null ) {
			return true;
		}
		return false;
	}

}
