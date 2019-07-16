package com.Inventory.springbootexample.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Inventory.springbootexample.model.InventoryPojo;
import com.Inventory.springbootexample.service.InventService;

@Controller

public class InventoryController {
	
	 @Autowired
	private InventService inventService;
	
	@RequestMapping(value ="/enroll",method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		InventoryPojo student = new InventoryPojo();
		model.addAttribute("student", student);
		return "enroll";
	}
	
	@RequestMapping(value ="/save",method = RequestMethod.POST)
	public String saveRegistration(@Valid InventoryPojo student,
			BindingResult result, ModelMap model,RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {
			return "enroll";//w
		}
		inventService.save(student);		
		return "redirect:/viewproducts/1";
	}
	
	@RequestMapping("/viewproducts")  
    public ModelAndView viewstudents(){  
        List<InventoryPojo> list=inventService.getAllItems();
        return new ModelAndView("viewproducts","list",list);  
    } 
	
	/* It opens the product list for the given page id */
	@RequestMapping(value="/viewproducts/{pageid}")  
    public ModelAndView edit(@PathVariable int pageid){  
        int total=5;  
        if(pageid==1){}  
        else{  
            pageid=(pageid-1)*total+1;  
        }  
        List<InventoryPojo> list=inventService.getItemsByPage(pageid,total);  
          
        return new ModelAndView("viewproducts","list",list);  
    }
	
	 /* It deletes record for the given id */  
	    @RequestMapping(value="/deletestudent/{id}",method = RequestMethod.GET)  
	    public ModelAndView delete(@PathVariable int id){  
	    	inventService.delete(id);  
	        return new ModelAndView("redirect:/viewstudents/1");  
	    }  
	    
	    /* It deletes record for the given id */  
	    @RequestMapping(value="/delete",method = RequestMethod.GET)  
	    public ModelAndView delete(){  
	    	inventService.delete();  
	        return new ModelAndView("redirect:/enroll");  
	    }  
	
	 @ModelAttribute("pageCount")
		public List<String> initializePageCount() {
		    int total=5;  
			List<String> pageCount = new ArrayList<String>();
			int count=inventService.count(); 
			int result=((count/total)+ (count%total));
			for(int k=0;k<result;k++) {
				pageCount.add(new Integer(k).toString());
			}
			
			return pageCount;
		}

}
