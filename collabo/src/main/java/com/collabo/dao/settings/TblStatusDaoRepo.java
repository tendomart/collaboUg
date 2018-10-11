package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblStatus;

public interface TblStatusDaoRepo extends CrudRepository<TblStatus, Integer> {
	
}
