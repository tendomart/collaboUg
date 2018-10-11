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
import com.collabo.model.users.TblUsers;
import com.collabo.restcontroller.base.CollaboBaseController;
import com.collabo.service.ItemService;
@RestController
@RequestMapping("permission")
public class TblPermissionsController extends CollaboBaseController<TblPermissions>{
	@Autowired(required = true) 
	 @Qualifier("tblPermissionsServiceImpl")
	 public ItemService<TblPermissions> serv;
	@Override
	public Iterable<TblPermissions> list(Model model) {
		List<TblPermissions> sv = (List<TblPermissions>) serv.getAllItems();
		return sv;
		}

	@Override
	public ResponseEntity<Optional<TblPermissions>> showProduct(Integer id, Model model) {
		Optional<TblPermissions> ases = serv.getItemById(id);
		if (ases == null) {
			//log.debug("Assesment with id " + id + " does not exists");
			return new ResponseEntity<Optional<TblPermissions>>(HttpStatus.NOT_FOUND);
		}
        //log.debug("Found Assessment:: " + ases);
		return new ResponseEntity<Optional<TblPermissions>>(ases, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<TblPermissions> saveProduct(TblPermissions it) {
		serv.addItem(it);;
		//log.debug("Added:: " + as);
		return new ResponseEntity<TblPermissions>(it, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<TblPermissions> updateProduct(Integer id, TblPermissions it) {
		// TODO Auto-generated method stub
		return super.updateProduct(id, it);
	}

	@Override
	public ResponseEntity<TblPermissions> delete(Integer id) {
		//log.debug("Fetching & Deleting Appeal with id:: " + id);
				Optional<TblPermissions> ast = serv.getItemById(id);
				if (ast == null) {
					//log.debug("Unable to delete. Assessment with id " + id + " not found");
					return new ResponseEntity<TblPermissions>(HttpStatus.NOT_FOUND);
				}
				serv.removeItem(id);;
				return new ResponseEntity<TblPermissions>(HttpStatus.GONE);

	}

	@Override
	public ResponseEntity<TblPermissions> deletelist(Model model) {
		serv.removeAllItems();
		return new ResponseEntity<TblPermissions>(HttpStatus.NO_CONTENT);
	}
	
}
