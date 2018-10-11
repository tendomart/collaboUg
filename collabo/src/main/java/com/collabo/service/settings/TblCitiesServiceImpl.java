package com.collabo.service.settings;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabo.model.settings.TblCities;
import com.collabo.service.GenericService;
import com.collabo.service.ItemService;

@Service
@Qualifier("tblCitiesServiceImpl")
@Transactional
public class TblCitiesServiceImpl extends GenericService<TblCities>implements ItemService<TblCities> {
	
	@Override
	public Iterable<TblCities> getAllItems() {
		
		log.info("Returning All Cities ...");
		return crud.findAll();
	}
	
	@Override
	public void addItem(TblCities fm) {
		log.info("Saving City ...");
		crud.save(fm);
	}
	
	@Override
	public Optional<TblCities> getItemById(int id) {
		log.info("Getting City ...");
		return crud.findById(id);
	}
	
	
	@Override
	public void removeItem(int id) {
		log.info("Deleting Item ...");
		crud.deleteById(id);
	}
	
	@Override
	public void removeItemByName(TblCities bio) {
		log.info("Deleting City ...");
		crud.delete(bio);
	}
	
	@Override
	public void removeAllItems() {
		log.info("Deleting All Cities ...");
		crud.deleteAll();
	}
	
}
