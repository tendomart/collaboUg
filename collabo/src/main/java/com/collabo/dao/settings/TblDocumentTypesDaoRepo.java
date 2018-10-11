package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblDocumentTypes;

public interface TblDocumentTypesDaoRepo extends CrudRepository<TblDocumentTypes, Integer> {
	
}
