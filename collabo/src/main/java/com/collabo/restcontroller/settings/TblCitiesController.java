package com.collabo.restcontroller.settings;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabo.model.settings.TblCities;
import com.collabo.restcontroller.base.CollaboBaseController;
import com.collabo.service.ItemService;
@RestController
@RequestMapping("city")
public class TblCitiesController extends CollaboBaseController<TblCities>{
	
	private static final Logger log = LogManager.getLogger("com.collabo.restcontroller.settings.TblCitiesController");
	
	 @Autowired
	 @Qualifier("tblCitiesServiceImpl")
	 public ItemService<TblCities> serv;
	
	@Override
	public Iterable<TblCities> list(Model model) {
		log.info("");
		return serv.getAllItems();
	}
	@Override
	public ResponseEntity<TblCities> saveProduct(TblCities it) {
		log.info("");
		serv.addItem(it);
		return new ResponseEntity<TblCities>(it, HttpStatus.OK);
		
	}
	@Override
	public ResponseEntity<Optional<TblCities>> showProduct(Integer id, Model model) {
		log.info("");
		Optional<TblCities> ct = serv.getItemById(id);
		if (ct == null) {
			log.debug("City with id " + id + " does not exist");
			return new ResponseEntity<Optional<TblCities>>(HttpStatus.NOT_FOUND);
		}
        log.debug("Found City " + ct);
		return new ResponseEntity<Optional<TblCities>>(ct, HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<TblCities> updateProduct(Integer id, TblCities it) {
		// TODO Auto-generated method stub
		return super.updateProduct(id, it);
	}
	
	@Override
	public ResponseEntity<TblCities> delete(Integer id) {
		serv.removeItem(id);;
		return new ResponseEntity<TblCities>(HttpStatus.GONE);
	}
	
	@Override
	public ResponseEntity<TblCities> deletelist(Model model) {
		log.debug("Deleting All Cities...");
		serv.removeAllItems();
		return new ResponseEntity<TblCities>(HttpStatus.NO_CONTENT);
	}
}
