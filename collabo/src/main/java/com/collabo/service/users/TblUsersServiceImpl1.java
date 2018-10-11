package com.collabo.service.users;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabo.dao.users.TblUsersDaoRepo;
import com.collabo.model.users.TblUsers;
import com.collabo.service.ItemService;

@Service
@Qualifier("tblUsersServiceImpl1")
@Transactional
public class TblUsersServiceImpl1 implements ItemService<TblUsers> {
	private static final Logger log = LogManager.getLogger("com.collabo.service.users.TblUsersServiceImpl1");
	@Autowired
	TblUsersDaoRepo us;
	@Override
	public Iterable<TblUsers> getAllItems() {
		log.info("Returning All Users ...");
		return us.findAll();
	}

	@Override
	public void addItem(TblUsers fm) {
		log.info("Saving User ...");
		us.save(fm);
	}

	@Override
	public Optional<TblUsers> getItemById(int id) {
		log.info("Returning User ...");
		return us.findById(id);
	}

	@Override
	public void removeItem(int id) {
		log.info("Deleting User By Id...");
		us.deleteById(id);
	}

	@Override
	public void removeItemByName(TblUsers bio) {
		log.info("Returning User By Name...");
		
	}

	@Override
	public void removeAllItems() {
		log.info("Deleting All Users ...");
		
	}
	
}
