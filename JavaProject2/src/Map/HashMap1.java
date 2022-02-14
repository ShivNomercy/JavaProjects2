package Map;

import java.util.HashMap;

public class HashMap1 {
	  public static void main(String[] args) {
	 HashMap <String,Integer> map = new HashMap();
		  
		     map.put("Rahul", 20);
		     map.put("Rahul", 20);
		     map.put("Sachin", 30);
		     map.put("Raju", 30);
		     map.put("Rani", 39);
		     map.put("Deepak", 32);
		     map.put("Rahu", 21);
		     
		     System.out.println(map);
		     System.out.println(map.containsKey("Rahul"));
		     System.out.println(map.get("Deepak"));
		     
		        if(map.containsKey("Rani"))	
		        {
		        	int i = map.get("Sachin");
		        	System.out.println("the age of sachin is = "+i);
		        }
		        
		        	
		        
		     
		    	 
		     }
	}


