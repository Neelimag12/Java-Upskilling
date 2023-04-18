package com.upskilling;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		System.out.println("The Factorial of " + num + " is " + fact);
		sc.close();
	}

}
