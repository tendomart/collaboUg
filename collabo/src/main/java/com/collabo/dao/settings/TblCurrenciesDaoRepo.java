package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblCurrencies;

public interface TblCurrenciesDaoRepo extends CrudRepository<TblCurrencies, Integer> {
	
}
