package com.collabo.service.users;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabo.dao.users.TblAccessLevelsDaoRepo;
import com.collabo.model.users.TblAccessLevels;
import com.collabo.service.ItemService;

@Service
@Qualifier("tblAccessLevelsServiceImpl")
@Transactional
public class TblAccessLevelsServiceImpl implements ItemService<TblAccessLevels> {
	
	private static final Logger log = LogManager.getLogger("com.collabo.service.users.TblAccessLevelsServiceImpl");
	@Autowired
	public TblAccessLevelsDaoRepo acc;
	@Override
	public Iterable<TblAccessLevels> getAllItems() {
		log.info("");
		return acc.findAll();
	}
	
	@Override
	public void addItem(TblAccessLevels fm) {
		log.info("");
		acc.save(fm);
	}
	
	@Override
	public Optional<TblAccessLevels> getItemById(int id) {
		log.info("");
		return acc.findById(id);
	}

	public TblAccessLevels findAllById(Iterable<Integer> ids) {
		log.info("");
		return (TblAccessLevels) acc.findAllById(ids);
	}
	
	@Override
	public void removeItem(int id) {
		log.info("");
		acc.deleteById(id);
	}
	
	@Override
	public void removeItemByName(TblAccessLevels bio) {
		log.info("");
		acc.delete(bio);
	}
	
	@Override
	public void removeAllItems() {
		log.info("");
		acc.deleteAll();
	}
	
}
