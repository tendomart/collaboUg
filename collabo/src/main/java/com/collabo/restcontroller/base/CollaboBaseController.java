package com.collabo.restcontroller.base;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabo.model.users.TblUsers;

import io.swagger.annotations.ApiOperation;
@RestController
public class CollaboBaseController<Item> {
	
	 String  pdt = null;
	
	 
	@GetMapping(value = "/items", produces = "application/json")
	public Iterable<Item> list(Model model){
        //Iterable<Item> productList = productService.listAllProducts();
		return null;
		}
	@GetMapping(value = "/item/{id}", produces = "application/json")
    public  ResponseEntity<Optional<Item>> showProduct(@PathVariable Integer id, Model model){

       // Item it = (Item) productService.findById(id);

         return null;

     }

     @ApiOperation(value = "Add an Item")

     //@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")

     @PostMapping(value = "/item", consumes = "application/json")
     public ResponseEntity<Item> saveProduct(@RequestBody Item it){
        // productService.save(it);

         return new ResponseEntity<Item>((Item) (pdt+" saved successfully"), HttpStatus.OK);

     }

     @ApiOperation(value = "Update a product")

@PutMapping(value = "/item/{id}", consumes = "application/json")
     public ResponseEntity<Item> updateProduct(@PathVariable Integer id, @RequestBody Item it){
  
         //Item storedItem = (Item) productService.findById(id);
         
         //storedItem.setDescription(it.getDescription());

         //storedItem.setImageUrl(it.getImageUrl());

         //storedItem.setPrice(it.getPrice());

         //storedItem.saveProduct(storedProduct);

         return new ResponseEntity<Item>((Item) (pdt+"  updated successfully"), HttpStatus.OK);

     }

     @ApiOperation(value = "Delete an Item")
@DeleteMapping(value="/delete/{id}", produces = "application/json")
     public ResponseEntity<Item> delete(@PathVariable Integer id){
        // productService.deleteById(id);
         return new ResponseEntity<Item>((Item) (pdt+" deleted successfully"), HttpStatus.OK);

     }
     
     @DeleteMapping(value = "/items", produces = "application/json")
 	public ResponseEntity<Item> deletelist(Model model){
    	 return new ResponseEntity<Item>((Item) ("All "+pdt+"s deleted successfully"), HttpStatus.OK);
 		}
 	
}
