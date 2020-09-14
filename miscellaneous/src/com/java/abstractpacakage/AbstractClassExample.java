package com.java.abstractpacakage;

public abstract class AbstractClassExample {
	
	
	
	public AbstractClassExample() {
		
		// TODO Auto-generated constructor stub
		
		System.out.println("Constructer from Abstract Class");
	}

	abstract int sum(int a, int b);
	
	public int sum(int c, int d, int e) {
		return c+d+e;
	}
	
	static double add(double f, double u) {
		
		return f+u;
	}

}
