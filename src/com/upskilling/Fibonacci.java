package com.upskilling;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int n=sc.nextInt();
		int previous=0,current=1;
		System.out.println("Fibonacci sequence up to " + n +": ");
		while(previous<=n) {
			System.out.println(previous + " ");
			int next = previous + current;
			previous=current;
			current=next;
		}

	}

}
