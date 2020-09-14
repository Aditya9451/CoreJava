package com.practice.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list1 = new ArrayList<String>();
		

		list1.add("Aditya");
		list1.add("Preeti");
		list1.add("Priyanka");
		
		List<String> list2 = new ArrayList<String>();
		list1.stream().map(n->n.toLowerCase()).forEach(y->System.out.println(y));
		
		for (String string : list2) {
			System.out.println(string);
		}
	}

}
