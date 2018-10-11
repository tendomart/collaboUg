package com.collabo.dao.users;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.users.TblAccessLevels;

public interface TblAccessLevelsDaoRepo extends CrudRepository<TblAccessLevels, Integer> {
	
}
