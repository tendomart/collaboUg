package com.collabo.dao.users;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.users.TblPermissions;


public interface TblPermissionsDaoRepo extends CrudRepository<TblPermissions, Integer> {
	
}
