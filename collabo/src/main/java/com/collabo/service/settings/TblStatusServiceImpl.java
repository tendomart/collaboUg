package com.collabo.service.settings;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabo.dao.settings.TblStatusDaoRepo;
import com.collabo.model.settings.TblStatus;
import com.collabo.service.GenericService;
import com.collabo.service.ItemService;

@Service
@Qualifier("tblStatusServiceImpl")
@Transactional
public class TblStatusServiceImpl extends GenericService<TblStatus> implements ItemService<TblStatus> {
	
	private static final Logger log = LogManager.getLogger("com.collabo.service.settings.TblStatusServiceImpl");
	
	@Autowired
	private TblStatusDaoRepo st;
	@Override
	public Iterable<TblStatus> getAllItems() {
		log.info("Finfing All Satuses ...");
		return st.findAll();
	}
	
	@Override
	public void addItem(TblStatus fm) {
		log.info("Saving Status...");
		st.save(fm);
	}
	
	@Override
	public Optional<TblStatus> getItemById(int id) {
		log.info("Returning Status ...");
		return st.findById(id);
	}
	
	
	@Override
	public void removeItem(int id) {
		log.info("Deleting Status ...");
		st.deleteById(id);
	}
	
	@Override
	public void removeItemByName(TblStatus bio) {
		log.info("Deleting Status ...");
		st.delete(bio);
	}
	
	@Override
	public void removeAllItems() {
		log.info("Removing All Status ...");
		st.deleteAll();
	}
	
}
