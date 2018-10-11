package com.collabo.dao.users;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.users.LoginAndAuthentication;


public interface LoginAndAuthenticationDaoRepo extends CrudRepository<LoginAndAuthentication, Integer> {
	
}
