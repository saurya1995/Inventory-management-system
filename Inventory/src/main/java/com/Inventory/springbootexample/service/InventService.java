package com.Inventory.springbootexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventory.springbootexample.dao.InventDAO;
import com.Inventory.springbootexample.model.InventoryPojo;

@Service
public class InventService implements InventoryService {

	@Autowired
	InventDAO inventDAO;
	
	public void save(InventoryPojo student) {
		inventDAO.save(student);
		
	}

	public List<InventoryPojo> getAllItems() {
		return inventDAO.getAllItems();
	}
	
	public List<InventoryPojo> getItemsByPage(int pageid, int total)
	{
		return inventDAO.getItemsByPage(pageid,total);
	}

	public int count() {
		return inventDAO.count();
	}

	public InventoryPojo getItemById(int id) {
		return inventDAO.getItemById(id);
	}

	public void update(InventoryPojo emp) {
		 inventDAO.update(emp);
	}

	public void delete(int id) {
		inventDAO.delete(id);
	}

	public void delete() {
		inventDAO.delete();
	}

	

}
