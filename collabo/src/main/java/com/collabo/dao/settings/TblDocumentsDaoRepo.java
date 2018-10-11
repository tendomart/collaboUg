package com.collabo.dao.settings;

import org.springframework.data.repository.CrudRepository;

import com.collabo.model.settings.TblDocuments;

public interface TblDocumentsDaoRepo extends CrudRepository<TblDocuments, Integer> {
	
}
