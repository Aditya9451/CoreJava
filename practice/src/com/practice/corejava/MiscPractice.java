package com.practice.corejava;

import java.io.IOException;

class MiscPracticeChild extends MiscPractice {

	public MiscPracticeChild() throws Exception {
		System.err.println("Child Class Constructor");
	}

}

public class MiscPractice {

	public MiscPractice() {

		System.out.println("Parent Class Constructor");

	}

	public static void main(String[] args) throws Exception {

		Object o = new String("Aditya");

		StringBuffer sb = (StringBuffer) o;
		System.out.println(sb);

		String str = new String("Aditya Raj");
		Object ob = str;

	}

}
