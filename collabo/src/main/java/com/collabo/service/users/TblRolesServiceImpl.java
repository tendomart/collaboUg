package com.collabo.service.users;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabo.dao.users.TblRolesDaoRepo;
import com.collabo.model.users.TblRoles;
import com.collabo.service.GenericService;
import com.collabo.service.ItemService;

@Service
@Qualifier("tblRolesServiceImpl")
@Transactional
public class TblRolesServiceImpl implements ItemService<TblRoles> {
	private static final Logger log = LogManager.getLogger("com.collabo.service.users.TblRolesServiceImpl");
	@Autowired
	TblRolesDaoRepo rl;
	@Override
	public Iterable<TblRoles> getAllItems() {
		log.info("Returing all Roles ...");
		return rl.findAll();
	}
	
	@Override
	public void addItem(TblRoles fm) {
		log.info("Saved Role ...");
		rl.save(fm);
	}
	
	@Override
	public Optional<TblRoles> getItemById(int id) {
		log.info("Getting Role By Id ..."+id);
		return rl.findById(id);
	}

	@Override
	public void removeItem(int id) {
		log.info("Removing Role ...");
		rl.deleteById(id);
	}
	
	@Override
	public void removeItemByName(TblRoles bio) {
		log.info("Removing Role ...");
		rl.delete(bio);
	}
	
	@Override
	public void removeAllItems() {
		log.info("Deleting All Roles ...");
		rl.deleteAll();
	}
	
}
