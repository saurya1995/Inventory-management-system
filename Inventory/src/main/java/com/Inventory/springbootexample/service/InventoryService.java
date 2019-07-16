package com.Inventory.springbootexample.service;

import java.util.List;

import com.Inventory.springbootexample.model.InventoryPojo;

public interface InventoryService {
	
	public void save(InventoryPojo student);
	public List<InventoryPojo> getAllItems();
	public List<InventoryPojo> getItemsByPage(int pageid, int total);
	public InventoryPojo getItemById(int id);
	public int count() ;
	public void update(InventoryPojo p);
	public void delete(int id);
	public void delete();

}
