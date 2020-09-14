package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StringImmutability {
	
	private final int a;
	private final String name;
	
	private final List<Integer> list;
	

	

	public StringImmutability(int a, String name, List<Integer> list) {
		super();
		this.a = a;
		this.name = name;
		this.list = list;
	}

	public int getA() {
		return a;
	}

	public String getName() {
		return name;
	}

	public List<Integer> getList() {
		return list;
	}
	

	public static void main(String[] args) {
		
		
		StringImmutability str= new StringImmutability(1,"Aditya", Arrays.asList(1,2,4,5));
		str.getList().add(8);
		
		System.out.println(str);
	}
	
	
	

}
