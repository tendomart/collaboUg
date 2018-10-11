package com.collabo.restcontroller.users;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabo.model.users.TblUsers;
import com.collabo.restcontroller.base.CollaboBaseController;
import com.collabo.service.ItemService;
//@RestController
//@RequestMapping("user")
public class TblUsersRestController extends CollaboBaseController<TblUsers>{
	
	private static final Logger log = LogManager.getLogger("com.collabo.restcontroller.users.TblUsersRestController");
	
	 @Autowired
	 @Qualifier("tblUsersServiceImpl1")
	 public ItemService<TblUsers> serv;
	public Iterable<TblUsers> list(Model model) {
		 Iterable<TblUsers> plist = serv.getAllItems();
		return plist;
	}
	
	
	@Override
	public ResponseEntity<TblUsers> saveProduct(@RequestBody TblUsers it) {
		serv.addItem(it);
		return new ResponseEntity<TblUsers>(it, HttpStatus.OK);
		//return new ResponseEntity<TblUsers>((TblUsers) ("User saved successfully"), HttpStatus.OK);
		//return super.saveProduct(it);
	}
	@Override
	public ResponseEntity<Optional<TblUsers>> showProduct(Integer id, Model model) {
		//Optional<TblUsers> us = serv.findById(id);
		//return super.showProduct(id, model);
		
		Optional<TblUsers> us = serv.getItemById(id);
		if (us == null) {
			//log.debug("Assesment with id " + id + " does not exists");
			return new ResponseEntity<Optional<TblUsers>>(HttpStatus.NOT_FOUND);
		}
        //log.debug("Found User:: " + us);
		return new ResponseEntity<Optional<TblUsers>>(us, HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<TblUsers> updateProduct(Integer id, TblUsers it) {
		Optional<TblUsers> storedItem =  serv.getItemById(id);
        
		storedItem.get().setDateInserted(it.getDateInserted());
		storedItem.get().setFirstName(it.getFirstName());
		storedItem.get().setEmail(it.getEmail());

        //storedItem.setImageUrl(it.getImageUrl());

        //storedItem.setPrice(it.getPrice());

        //storedItem.saveProduct(storedProduct);

		return super.updateProduct(id, it);
	}
	
	@Override
	public ResponseEntity<TblUsers> delete(Integer id) {
		serv.removeItem(id);;
		return super.delete(id);
	}
	
	@Override
	public ResponseEntity<TblUsers> deletelist(Model model) {
		serv.removeAllItems();
		return super.deletelist(model);
	}
	
	
	/*
	//-------------------Retrieve All Assessments--------------------------------------------------------
	
		@GetMapping("items")
		public ResponseEntity<List<TblUsers>> listAllUsers() {
			List<TblUsers> sv = (List<TblUsers>) serv.findAll();
			if (sv.isEmpty()) {
				return new ResponseEntity<List<TblUsers>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
			}
			return new ResponseEntity<List<TblUsers>>(sv, HttpStatus.OK);
		}
		
		//-------------------Retrieve Single Assesment by Id--------------------------------------------------------
		
		@GetMapping(value="item/{id}",consumes="application/json")
		public ResponseEntity<Optional<TblUsers>> getUser(@PathVariable("id") Integer id) {
			Optional<TblUsers> ases = serv.findById(id);
			if (ases == null) {
				log.debug("Assesment with id " + id + " does not exists");
				return new ResponseEntity<Optional<TblUsers>>(HttpStatus.NOT_FOUND);
			}
	        log.debug("Found Assessment:: " + ases);
			return new ResponseEntity<Optional<TblUsers>>(ases, HttpStatus.OK);
		}
		
		//-------------------Create a User--------------------------------------------------------
		
		
		@PostMapping(value="item/{id}",consumes="application/json")
		public ResponseEntity<TblUsers> addEmployee(@RequestBody TblUsers ases) {
			serv.save(ases);
			log.debug("Added:: " + ases);
			return new ResponseEntity<TblUsers>(ases, HttpStatus.CREATED);
		}
		
		//------------------- Delete a User --------------------------------------------------------
		
		@DeleteMapping("item/{id}")
		public ResponseEntity<TblUsers> deleteUser(@PathVariable("id") Integer id) {
			log.debug("Fetching & Deleting Appeal with id:: " + id);
			Optional<TblUsers> ast = serv.findById(id);
			if (ast == null) {
				log.debug("Unable to delete. Assessment with id " + id + " not found");
				return new ResponseEntity<TblUsers>(HttpStatus.NOT_FOUND);
			}
			serv.deleteById(id);
			return new ResponseEntity<TblUsers>(HttpStatus.GONE);
		}
		
		//------------------- Delete All Users --------------------------------------------------------
		
		@DeleteMapping("items")
		public ResponseEntity<TblUsers> deleteAllUsers() {
			

			return new ResponseEntity<TblUsers>(HttpStatus.NO_CONTENT);
		}
		
		*/
}
