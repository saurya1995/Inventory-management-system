package com.Inventory.springbootexample.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.Inventory.springbootexample.model.InventoryPojo;

@Service
public class InventDAO implements InventoryDAO {
	
	
	JdbcTemplate template;  
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}

	
	
	public void save(InventoryPojo p) {
	
		String sql="insert into Student(firstName,quantity) values('"+p.getFirstName()+"','"+p.getQuantity()+"')";
		System.out.println(sql);
	     template.update(sql);  
	}
	
	
	public List<InventoryPojo> getAllItems() {
		
		
		return template.query("select * from Student",new ResultSetExtractor<List<InventoryPojo>>(){  
		    
		     public List<InventoryPojo> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<InventoryPojo> list=new ArrayList<InventoryPojo>();  
		        while(rs.next()){  
		        	InventoryPojo e=new InventoryPojo();  
		        e.setId(rs.getInt(1));  
		        e.setFirstName(rs.getString(2));  
		        e.setQuantity(rs.getInt(3));		        
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  
		
		  }
	
	public List<InventoryPojo> getItemsByPage(int pageid, int total) {

		 String sql="select * from Student limit "+(pageid-1)+","+total;  
		 return template.query(sql,new ResultSetExtractor<List<InventoryPojo>>(){  
		    
		     public List<InventoryPojo> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<InventoryPojo> list=new ArrayList<InventoryPojo>();  
		        
		        while(rs.next()){  
		        	InventoryPojo e=new InventoryPojo();  
		        e.setId(rs.getInt(1));  
		        e.setFirstName(rs.getString(2));  
		        e.setQuantity(rs.getInt(3)); 
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  }
	
	public InventoryPojo getItemById(int id) {
	
				 return template.query("select * from Student where ID="+id,new ResultSetExtractor<InventoryPojo>(){  
					    
				     public InventoryPojo extractData(ResultSet rs) throws SQLException,  
				            DataAccessException {  
				      
				    	 InventoryPojo e=new InventoryPojo();  
				        while(rs.next()){  
				       
				        	e.setId(rs.getInt(1));  
					        e.setFirstName(rs.getString(2));  
					        e.setQuantity(rs.getInt(3));    
				        }  
				        return e;  
				        }  
				    });  
			}


	public int count() {
		String sql="select count(*) from Student";
		int count = template.queryForObject(sql,Integer.class);
		return count;
		  }



	public void update(InventoryPojo p) {
		String sql="update Student set firstName='"+p.getFirstName()+"',quantity='"+p.getQuantity()+"' where ID="+p.getId()+"";
		System.out.println(sql);
       template.update(sql);  
	}



	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from Student where ID="+id+"";  
	    template.update(sql);  
		
	}



	public void delete() {
		// TODO Auto-generated method stub
		String sql="delete from Student where ID>0";  
	    template.update(sql); 
	}



	

	

}
