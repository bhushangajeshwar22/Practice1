package com.mypractice;

import java.util.Scanner;

public class Table {
	public static void multiplication (int num) {
		for (int i =1; i<=10; i++){
			int a = num * i;
			System.out.println(num + "*" + i + "=" + a);
		}
	}
public static void main (String args []) {
	System.out.println("Enter the number");
	Scanner sc = new Scanner (System.in);
	int s = sc.nextInt();
	System.out.println("Value you entered :"+s);
	multiplication(s);
	
}
}
