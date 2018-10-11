package com.collabo.service.settings;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabo.dao.settings.TblDateDaoRepo;
import com.collabo.model.settings.TblDate;
import com.collabo.service.GenericService;
import com.collabo.service.ItemService;

@Service
@Qualifier("tblDateServiceImpl")
@Transactional
public class TblDateServiceImpl extends GenericService<TblDate> implements ItemService<TblDate> {
	
	private static final Logger log = LogManager.getLogger("com.collabo.service.settings.TblDateServiceImpl");
	
	@Autowired
	private TblDateDaoRepo dt;
	@Override
	public Iterable<TblDate> getAllItems() {
		log.info("Returning All Dates...");
		return dt.findAll();
	}
	
	@Override
	public void addItem(TblDate fm) {
		log.info("Saving Date ...");
		dt.save(fm);
	}
	
	@Override
	public Optional<TblDate> getItemById(int id) {
		log.info("Fetching Date ...");
		return dt.findById(id);
	}
	
	
	@Override
	public void removeItem(int id) {
		log.info("Deleting Date By Id...");
		dt.deleteById(id);
	}
	
	@Override
	public void removeItemByName(TblDate bio) {
		log.info("Deleting Date ...");
		dt.delete(bio);
	}
	
	@Override
	public void removeAllItems() {
		log.info("Deleting All dates ...");
		dt.deleteAll();
	}
	
}
