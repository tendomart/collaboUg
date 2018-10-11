package com.collabo.dao.users;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.users.TblRoles;

public interface TblRolesDaoRepo extends CrudRepository<TblRoles, Integer> {
	
}
