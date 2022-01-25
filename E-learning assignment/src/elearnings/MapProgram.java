package elearnings;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
	public static void main(String args[]){  
		Map<Integer,String> map=new HashMap<Integer,String>();          
		      map.put(100,"Java");    
		      map.put(101,"Training");    
		      map.put(102,"Map");        
		      map.entrySet()  
		      .stream()    
		      .sorted(Map.Entry.comparingByKey())   
		      .forEach(System.out::println);  
		 }  
		}  


