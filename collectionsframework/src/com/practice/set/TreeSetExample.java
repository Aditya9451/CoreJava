package com.practice.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.practice.map.Employee;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts= new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(2);
		ts.add(4);
		ts.add(3);
		ts.add(6);
		
		System.out.println(ts);
		
		TreeSet<String> ts1= new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		
		ts1.add("Aditya");
		ts1.add("aditya");
		ts1.add("Mohan");
		ts1.add("adit");
		
		System.out.println(ts1);
		
		if(ts1.contains("Mohan"))
			System.out.println("Yes");
		
		System.out.println(ts1.first());
		System.out.println(ts1.last());
		System.out.println(ts1.pollFirst());
		System.out.println(ts1.pollLast());
		System.out.println(ts1.higher("adit"));
		System.out.println(ts1);
		
		TreeSet<Employee> ts2= new TreeSet<Employee>();
		
		ts2.add( new Employee("Aditya",28));
		ts2.add( new Employee("Aditya Raj",27));
		ts2.add( new Employee("Mohan",25));
		ts2.add(  new Employee("Ramu Raj",29));
		
		System.out.println(ts2);
		
		TreeSet<Employee> ts3= new TreeSet<Employee>(Comparator.comparing(Employee::getName));
		
		ts3.add( new Employee("Aditya",28));
		ts3.add( new Employee("Aditya Raj",27));
		ts3.add( new Employee("Mohan",25));
		ts3.add(  new Employee("Ramu Raj",29));
		
		System.out.println(ts3);
		

	}

}
