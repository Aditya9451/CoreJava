package com.practice.corejava;

public class FrequencyApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geeksforgeeeks";

		//char[] ch = str.toCharArray();

		int fre[] = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {

			fre[i] = 1;
			
			for(int j=i+1;j<str.length();j++)
			{
				
				if(str.charAt(i)==str.charAt(j))
					fre[i]++;
				
			}
		}
		
	for(int i=0;i<str.length();i++) {
		
		System.out.println(str.charAt(i)+fre[i]);
	}
}
}
