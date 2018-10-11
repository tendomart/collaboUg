package com.collabo.restcontroller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabo.model.users.TblRoles;
import com.collabo.restcontroller.base.CollaboBaseController;
import com.collabo.service.ItemService;
@RestController
@RequestMapping("roles")
public class TblRolesController extends CollaboBaseController<TblRoles>{
	 @Autowired
	 @Qualifier("tblRolesServiceImpl")
	 public ItemService<TblRoles> serv;
	 
	 @Override
	public Iterable<TblRoles> list(Model model) {
		 Iterable<TblRoles> rlist = serv.getAllItems();
		return super.list((Model) rlist);
	}
	 /*
	 @Override
	public ResponseEntity<TblRoles> saveProduct(TblRoles it) {
		 //log.info("");
			Optional<TblRoles> ct = serv.addItem(it);
			if (ct == null) {
				//log.debug("City with id " + it + " does not exist");
				return new ResponseEntity<Optional<TblRoles>>(HttpStatus.NOT_FOUND);
			}
	        //log.debug("Found City " + ct);
			return new ResponseEntity<Optional<TblRoles>>(ct, HttpStatus.OK);
	}
	 
	 @Override
	public TblRoles showProduct(Integer id, Model model) {
		 Optional<TblUsers> ases = serv.getItemById(id)
			if (ases == null) {
				//log.debug("Assesment with id " + id + " does not exists");
				return new ResponseEntity<Optional<TblUsers>>(HttpStatus.NOT_FOUND);
			}
	        //log.debug("Found Assessment:: " + ases);
			return new ResponseEntity<Optional<TblUsers>>(ases, HttpStatus.OK);
	}
	
	*/
}
