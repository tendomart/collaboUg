package com.collabo.service.users;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collabo.dao.users.LoginAndAuthenticationDaoRepo;
import com.collabo.model.users.LoginAndAuthentication;
import com.collabo.service.ItemService;

@Service
@Qualifier("loginAndAuthenticationServiceImpl")
@Transactional
public class LoginAndAuthenticationServiceImpl implements ItemService<LoginAndAuthentication> {
	
	private static final Logger log = LogManager.getLogger("com.collabo.service.users.LoginAndAuthenticationServiceImpl");
	
	@Autowired
	private LoginAndAuthenticationDaoRepo lg;
	@Override
	public Iterable<LoginAndAuthentication> getAllItems() {
		log.info("");
		return lg.findAll();
	}
	
	@Override
	public void addItem(LoginAndAuthentication fm) {
		log.info("Saving Login Info...");
		lg.save(fm);
	}
	
	@Override
	public Optional<LoginAndAuthentication> getItemById(int id) {
		log.info("Collecting Account Info...");
		return lg.findById(id);
	}
	
	
	@Override
	public void removeItem(int id) {
		log.info("");
		lg.deleteById(id);
	}
	
	@Override
	public void removeItemByName(LoginAndAuthentication bio) {
		log.info("Removing " + bio);
		lg.delete(bio);
	}

	@Override
	public void removeAllItems() {
		log.info("Deleting All Accounts ...");
		lg.deleteAll();
	}
	
}
