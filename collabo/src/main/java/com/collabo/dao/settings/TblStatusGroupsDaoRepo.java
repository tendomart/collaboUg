package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblStatusGroups;

public interface TblStatusGroupsDaoRepo extends CrudRepository<TblStatusGroups, Integer> {
	
}
