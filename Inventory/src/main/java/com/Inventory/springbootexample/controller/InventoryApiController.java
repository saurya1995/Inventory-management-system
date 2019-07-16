package com.Inventory.springbootexample.controller;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Inventory.springbootexample.model.InventoryPojo;
import com.Inventory.springbootexample.service.InventService;

@RestController
@RequestMapping("/getinv")
public class InventoryApiController {
	@Autowired
	private InventService inventService;
	
	/* to save an employee*/
	@GetMapping("/inventory")
	public List<InventoryPojo> getAllEmployees(){
		return inventService.getAllItems();
	}
	
	@GetMapping("/inventory/{pageid}")  
    public List<InventoryPojo> edit(@PathVariable int pageid){  
        int total=2;  
        if(pageid==1){}  
        else{  
            pageid=(pageid-1)*total+1;  
        }  
        List<InventoryPojo> list=inventService.getItemsByPage(pageid,total);  
		if(list==null) {
			return list;
		}
		return list;
       
    }
	
	@GetMapping("/purchase/{id}&{quantity}")
	public List<InventoryPojo> updateEmployee(@PathVariable(value="id") int itemid,@PathVariable(value="quantity") int qty){
		
		InventoryPojo emp=inventService.getItemById(itemid);
		if(emp==null) {
			return inventService.getAllItems();
		}
		int oldqty=emp.getQuantity();
		int newqty=oldqty-qty;
		emp.setQuantity(newqty);
        if(newqty<=0) {
        	inventService.delete(itemid);
        }
		inventService.update(emp);
		
		return inventService.getAllItems();		
		
	}
	@GetMapping("/generator")
	public void starter() {
	    Runnable runnable = new Runnable() {
	        public void run() {
	          // task to run goes here
	          automator();
	        }
	      };
	      
	      ScheduledExecutorService service = Executors
	                      .newSingleThreadScheduledExecutor();
	  service.scheduleAtFixedRate(runnable, 0, 3, TimeUnit.SECONDS);
	}
	public void automator(){
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz"; 

        StringBuilder sb = new StringBuilder(6); 

        for (int i = 0; i < 6; i++) { 
        int index = (int)(AlphaNumericString.length() * Math.random());  
        sb.append(AlphaNumericString.charAt(index)); 
        } 

        String product= sb.toString(); 
        InventoryPojo emp=new InventoryPojo();
        emp.setFirstName(product);
        int rqty=(int)(Math.random()*100)%10;
        emp.setQuantity(rqty);
		inventService.save(emp);
	}
	
}
