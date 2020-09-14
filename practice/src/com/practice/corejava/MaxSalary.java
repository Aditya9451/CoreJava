package com.practice.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class MaxSalary {
	
	private int salary;
	private String name;
	
	public MaxSalary(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}


	@Override
	public String toString() {
		return "MaxSalary [salary=" + salary + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<MaxSalary>maximum= new ArrayList<MaxSalary>();
		
		maximum.add(new MaxSalary(10000, "Ram"));
		maximum.add(new MaxSalary(20000, "Shyam"));
		maximum.add(new MaxSalary(30000,"Raju"));
		maximum.add(new MaxSalary(5000, "Mohan"));
		
		
		Comparator<MaxSalary> max= new Comparator<MaxSalary>() {
			
			@Override
			public int compare(MaxSalary max1, MaxSalary max2) {
				// TODO Auto-generated method stub
				
				if(max1.salary>max2.salary)
				return 1;
				else if(max1.salary<max2.salary)
					return -1;
				else
					return 0;
			}
		};
		Collections.sort(maximum, max);
		
		System.out.println(maximum);
		
		int max11= maximum.get(maximum.size()-1).salary;
		//Integer res= maximum.stream().max(comparator)
		
		
		System.out.println(max11);	
		
		/*
		 * Map<String, MaxSalary> topEmployees = maximum.stream() .collect(groupingBy( e
		 * -> e.department, collectingAndThen(maxBy(comparingInt(e -> e.salary)),
		 * Optional::get) ));
		 */
	}

}
