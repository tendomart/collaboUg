package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblCities;

public interface TblCitiesDaoRepo extends CrudRepository<TblCities, Integer> {
	
}
