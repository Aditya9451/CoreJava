package com.collections.comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.practice.map.Employee;

public class ComparaterAndComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list1 = new ArrayList<Employee>();
		Employee e1= new Employee("Gholu",28);
		Employee e2= new Employee("Aditya Raj",27);

		list1.add(e1);
		list1.add(e2);
		
		//Comparator<Employee> cmp = new Comparator<Employee>() {

//			@Override
//			public int compare(Employee o1, Employee o2) {
//				if(o1.getAge()>o2.getAge())
//					return 1 ;
//				else if(o1.getAge()<o2.getAge())
//				return -1;
//				
//				return 0;
//				
//			}
//		
		
		//};
		Collections.sort(list1, (o1,o2)->{
		
			if(o1.getAge()>o2.getAge())
				return 1 ;
			else if(o1.getAge()<o2.getAge())
			return -1;
			
			return 0;
			
			
		});
		
		System.out.println(list1);
	}

}
