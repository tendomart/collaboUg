package com.collabo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.repository.CrudRepository;

public class GenericService<Item>  {
public CrudRepository<Item, Integer> crud;
	public final Logger log = LogManager.getLogger("com.collabo.service." + Class.class);
	
	
}
