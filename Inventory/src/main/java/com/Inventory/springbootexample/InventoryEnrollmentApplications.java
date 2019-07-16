package com.Inventory.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class InventoryEnrollmentApplications {  
	 
	public static void main(String[] args) {  
				
		SpringApplication.run(InventoryEnrollmentApplications.class, args);
		
	}

}
