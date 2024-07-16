package com.mypractice;

public class Addition {

	public static int addition (int a , int b) {
		int addition = a+b;
		return addition;
	}
	public static void main (String sargs[]) {
		int x = 8;
		int y = 10;
		int z = addition(x,y);
		System.out.println(z);
	}
}
