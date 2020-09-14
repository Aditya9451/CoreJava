package com.java.abstractpacakage;

public class MainClass extends AbstractClassExample {

	public MainClass() {

		System.out.println("Constructer from subclass");
	}

	@Override
	int sum(int a, int b) {
		return a + b;

	}

	static double add(double f, double u) {

		return 2.0 * (f + u);
	}

	public static void main(String[] args) {

		AbstractClassExample ex = new MainClass();
		MainClass ex2 = new MainClass();
		System.out.println(ex.add(2, 3));
		System.out.println((Math.round(AbstractClassExample.add(4.3, 5.6))));
		System.out.println((Math.round(MainClass.add(4.3, 5.6))));
		System.out.println((Math.round(ex.add(4.3, 5.6))));
		System.out.println((Math.round(ex2.add(4.3, 5.6))));

	}

}
