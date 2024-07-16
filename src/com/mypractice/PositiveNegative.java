package com.mypractice;

import java.util.Scanner;

public class PositiveNegative {
	public static void main (String arga[]) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		long z = sc.nextLong();
		if (z>0) {
			System.out.println("this is positive number");
		}
		else {
			System.out.println("this is negative number");
		}
		
	}

}
