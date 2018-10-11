package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblTemplateTypes;

public interface TblTemplateTypesDaoRepo extends CrudRepository<TblTemplateTypes, Integer> {
	
}
