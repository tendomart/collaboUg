package com.collabo.dao.users;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.users.TblUsers;

public interface TblUsersDaoRepo extends CrudRepository<TblUsers, Integer> {
	
}
