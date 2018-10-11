package com.collabo.service;

import java.util.Optional;

public interface ItemService<item> {
	
	public Iterable<item> getAllItems();
	
	public void addItem(item fm);
	
	//public void updateItem(item fm);
	
	public Optional<item> getItemById(int id);
	
	//public item findAllById(Iterable<Integer> ids);
	//public item getItemByName(String itemName);
	
	public void removeItem(int id);
	
	public void removeItemByName(item bio);
	
	public void removeAllItems();
}
