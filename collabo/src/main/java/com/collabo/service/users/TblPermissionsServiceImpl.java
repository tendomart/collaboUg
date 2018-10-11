package com.collabo.service.users;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabo.dao.users.TblPermissionsDaoRepo;
import com.collabo.model.users.TblPermissions;
import com.collabo.service.GenericService;
import com.collabo.service.ItemService;

@Service
@Qualifier("tblPermissionsServiceImpl")
@Transactional
public class TblPermissionsServiceImpl  implements ItemService<TblPermissions> {
	private static final Logger log = LogManager.getLogger("com.collabo.service.users.TblPermissionsServiceImpl");
	
	@Autowired
	TblPermissionsDaoRepo pm;
	@Override
	public Iterable<TblPermissions> getAllItems() {
		this.log.info("Returning Permissions ...");
		return pm.findAll();
	}
	
	@Override
	public void addItem(TblPermissions fm) {
		this.log.info("Savinfg Permission ..");
		pm.save(fm);
	}
	
	@Override
	public Optional<TblPermissions> getItemById(int id) {
		this.log.info("");
		return pm.findById(id);
	}

	
	
	@Override
	public void removeItem(int id) {
		this.log.info("Delete Permission");
		pm.deleteById(id);
	}
	
	@Override
	public void removeItemByName(TblPermissions bio) {
		pm.delete(bio);
	}
	
	@Override
	public void removeAllItems() {
		this.log.info("Remove All Permissions ...");
		pm.deleteAll();
	}
	
}
