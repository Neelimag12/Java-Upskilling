package com.upskilling;

import java.util.Scanner;

public class SumDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int n=sc.nextInt();
		int i=1,sum=0;
		do {
			sum +=i;
			i++;
		}
		while(i<=n);
		System.out.println("The sum of all numbers from 1 to " + n + " is " + sum);

	}

}
