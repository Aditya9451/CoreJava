package com.practice.corejava;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			if (map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			else
				map.put(str.charAt(i), 1);
		}
		System.out.println(map);
		String result = "";
		
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			
			//System.out.print(m.getKey()+m.getValue());
		//System.out.print(m.getValue());
			
			result=result + m.getKey();
			result = result +m.getValue();
	}
	System.out.println(result);
	
	String []str1= new String[map.size()];
	
	for(int i=0;i<str1.length;i++) {
		
		
	}
	}
}
