package com.practice.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		
		HashMap< Employee, String> hm = new HashMap<Employee, String>();
		
		Employee e1= new Employee("Aditya",28);
		Employee e2= new Employee("Aditya Raj",27);
		Employee e3= new Employee("Raj", 30);
		System.out.println("CHeck1"+hm.put(e1,"Road"));
		System.out.println("Check "+hm.put(e2, "29"));
		hm.put(e3, "Patna");
		
		  for(Map.Entry<Employee, String> ent: hm.entrySet()) {
		  System.out.println(ent.getValue()); }
		  Set<Employee>hm1= hm.keySet();
		  System.out.println(hm1);
		  System.out.println("Removing e2 "+hm.remove(e2));
		  
		  
		  Employee e4= new Employee("Aditya",28);
		  System.out.println(e4.hashCode());
		  Employee e5= new Employee("Aditya",28);
		  System.out.println(e5.hashCode());
		  
		  HashMap< Employee, String> hm2 = new HashMap<Employee, String>();
		  hm2.put(e4,"A");
		  hm2.put(e5,"B");
		  
		  System.out.println("Hashmap 2 "+hm2);
		  
		  for(Employee e:hm2.keySet()) {
			  
			  System.out.println(e);
		  }
		  
		  
			  
		  
		  
		 

}
}