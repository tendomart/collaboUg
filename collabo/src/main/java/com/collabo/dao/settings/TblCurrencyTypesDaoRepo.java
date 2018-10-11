package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblCurrencyTypes;

public interface TblCurrencyTypesDaoRepo extends CrudRepository<TblCurrencyTypes, Integer> {
	
}
