package com.Inventory.springbootexample.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;


/**
 * The persistent class for the student database table.
 * 
 */
public class InventoryPojo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id

	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Size(min=3, max=30)
	private String firstName;
	private int quantity;

    public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


}