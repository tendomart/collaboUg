package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblTime;

public interface TblTimeDaoRepo extends CrudRepository<TblTime, Integer> {
	
}
