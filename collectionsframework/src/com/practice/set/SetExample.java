package com.practice.set;

//Java program to demonstrate a Set 

import java.util.*; 
public class SetExample{ 
	public static void main(String[] args) 
	{ 
		// Set demonstration using HashSet 
		Set<String> hash_Set 
			= new HashSet<String>(); 

		hash_Set.add("Geeks"); 
		hash_Set.add("For"); 
		hash_Set.add("Geeks"); 
		hash_Set.add("Example"); 
		hash_Set.add("Set"); 
		
		hash_Set.forEach(s->System.out.println(s));
		
//		for(String s:hash_Set) {
//			
//			hash_Set.add("set1");
//			System.out.println(s);
		
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(1,2,3,4,5));
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(1,2,4,5,6));
		System.out.println(set1);
		set1.addAll(set2);
		System.out.println(set1);
		set1.retainAll(set2);
		System.out.println(set1);
		
		
		
//		}
	} 
} 
