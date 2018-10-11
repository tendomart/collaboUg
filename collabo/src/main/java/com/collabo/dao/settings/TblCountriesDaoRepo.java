package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblCountries;

public interface TblCountriesDaoRepo extends CrudRepository<TblCountries, Integer> {
	
}
