package com.collabo.restcontroller.users;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabo.model.users.TblRoles;
import com.collabo.model.users.TblUsers;
import com.collabo.service.GenericService;
import com.collabo.service.ItemService;
@RestController
@RequestMapping("users")
public class TblUsersController {
	private static final Logger log = LogManager.getLogger("com.collabo.restcontroller.users.TblUsersController");
	
	@Autowired(required = true) 
	 @Qualifier("tblUsersServiceImpl")
	 public ItemService<TblUsers> serv;
	public Iterable<TblUsers> list(Model model) {
		 Iterable<TblUsers> plist = serv.getAllItems();
		return plist;
	}
	
	@GetMapping(value="items",produces="application/json")
	public ResponseEntity<List<TblUsers>> listAllUsers() {
		List<TblUsers> sv = (List<TblUsers>) serv.getAllItems();
		if (sv.isEmpty()) {
			return new ResponseEntity<List<TblUsers>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<TblUsers>>(sv, HttpStatus.OK);
	}
	
	//-------------------Retrieve Single Assesment by Id--------------------------------------------------------
	
	@GetMapping(value="item/{id}",produces="application/json")
	public ResponseEntity<Optional<TblUsers>> getUser(@PathVariable("id") Integer id) {
		Optional<TblUsers> ases = serv.getItemById(id);
		if (ases == null) {
			//log.debug("Assesment with id " + id + " does not exists");
			return new ResponseEntity<Optional<TblUsers>>(HttpStatus.NOT_FOUND);
		}
        //log.debug("Found Assessment:: " + ases);
		return new ResponseEntity<Optional<TblUsers>>(ases, HttpStatus.OK);
	}
	
	//-------------------Create a User--------------------------------------------------------
	
	
	@PostMapping(value="item",consumes="application/json")
	public ResponseEntity<TblUsers> addEmployee(@RequestBody TblUsers ases) {
		serv.addItem(ases);;
		//log.debug("Added:: " + as);
		return new ResponseEntity<TblUsers>(ases, HttpStatus.CREATED);
	}
	
	//------------------- Delete a User --------------------------------------------------------
	
	@DeleteMapping("item/{id}")
	public ResponseEntity<TblUsers> deleteUser(@PathVariable("id") Integer id) {
		//log.debug("Fetching & Deleting Appeal with id:: " + id);
		Optional<TblUsers> ast = serv.getItemById(id);
		if (ast == null) {
			//log.debug("Unable to delete. Assessment with id " + id + " not found");
			return new ResponseEntity<TblUsers>(HttpStatus.NOT_FOUND);
		}
		serv.removeItem(id);;
		return new ResponseEntity<TblUsers>(HttpStatus.GONE);
	}
	
	//------------------- Delete All Users --------------------------------------------------------
	
	@DeleteMapping("items")
	public ResponseEntity<TblUsers> deleteAllUsers() {
		//log.debug("Deleting All Assesments");
		serv.removeAllItems();
		return new ResponseEntity<TblUsers>(HttpStatus.NO_CONTENT);
	}
}
