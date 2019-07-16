package com.Inventory.springbootexample.dao;

import java.util.List;

import com.Inventory.springbootexample.model.InventoryPojo;

public interface InventoryDAO {
	
	public void save(InventoryPojo p);
	public List<InventoryPojo> getAllItems();
	public List<InventoryPojo> getItemsByPage(int pageid, int total);
	public InventoryPojo getItemById(int id);
	public int count() ;
	public void update(InventoryPojo p);
	public void delete(int id);
	public void delete();

}
