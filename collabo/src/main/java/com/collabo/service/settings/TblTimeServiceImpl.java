package com.collabo.service.settings;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabo.dao.settings.TblTimeDaoRepo;
import com.collabo.model.settings.TblTime;
import com.collabo.service.GenericService;
import com.collabo.service.ItemService;

@Service
@Qualifier("tblTimeServiceImpl")
@Transactional
public class TblTimeServiceImpl extends GenericService<TblTime> implements ItemService<TblTime> {
	
	private static final Logger log = LogManager.getLogger("com.collabo.service.settings.TblTimeServiceImpl");
	
	@Autowired
	private TblTimeDaoRepo tm;
	@Override
	public Iterable<TblTime> getAllItems() {
		log.info("Returning  Time Logs...");
		return tm.findAll();
	}
	
	@Override
	public void addItem(TblTime fm) {
		log.info("Saving Time ...");
		tm.save(fm);
	}
	
	@Override
	public Optional<TblTime> getItemById(int id) {
		log.info("Returning Time ...");
		return tm.findById(id);
	}
	
	@Override
	public void removeItem(int id) {
		log.info("Deleting Time");
		tm.deleteById(id);
	}
	
	@Override
	public void removeItemByName(TblTime bio) {
		log.info("");
		tm.delete(bio);
	}
	
	@Override
	public void removeAllItems() {
		log.info("Deleting All Time records ...");
		tm.deleteAll();
	}
	
}
