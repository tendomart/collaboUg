package com.collabo.restcontroller.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabo.model.users.TblAccessLevels;
import com.collabo.model.users.TblPermissions;
import com.collabo.restcontroller.base.CollaboBaseController;
import com.collabo.service.ItemService;
@RestController
@RequestMapping("access")
public class TblAccessLevelsController extends CollaboBaseController<TblAccessLevels>{
	@Autowired(required = true) 
	 @Qualifier("tblAccessLevelsServiceImpl")
	 public ItemService<TblAccessLevels> serv;
	@Override
	public Iterable<TblAccessLevels> list(Model model) {
		List<TblAccessLevels> sv = (List<TblAccessLevels>) serv.getAllItems();
		return sv;
	}

	@Override
	public ResponseEntity<Optional<TblAccessLevels>> showProduct(Integer id, Model model) {
		Optional<TblAccessLevels> ases = serv.getItemById(id);
		if (ases == null) {
			//log.debug("Assesment with id " + id + " does not exists");
			return new ResponseEntity<Optional<TblAccessLevels>>(HttpStatus.NOT_FOUND);
		}
        //log.debug("Found Assessment:: " + ases);
		return new ResponseEntity<Optional<TblAccessLevels>>(ases, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<TblAccessLevels> saveProduct(TblAccessLevels it) {
		serv.addItem(it);;
		//log.debug("Added:: " + as);
		return new ResponseEntity<TblAccessLevels>(it, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<TblAccessLevels> updateProduct(Integer id, TblAccessLevels it) {
		// TODO Auto-generated method stub
		return super.updateProduct(id, it);
	}

	@Override
	public ResponseEntity<TblAccessLevels> delete(Integer id) {
		//log.debug("Fetching & Deleting Appeal with id:: " + id);
				Optional<TblAccessLevels> ast = serv.getItemById(id);
				if (ast == null) {
					//log.debug("Unable to delete. Assessment with id " + id + " not found");
					return new ResponseEntity<TblAccessLevels>(HttpStatus.NOT_FOUND);
				}
				serv.removeItem(id);;
				return new ResponseEntity<TblAccessLevels>(HttpStatus.GONE);

	}

	@Override
	public ResponseEntity<TblAccessLevels> deletelist(Model model) {
		serv.removeAllItems();
		return new ResponseEntity<TblAccessLevels>(HttpStatus.NO_CONTENT);
	}
	
}
