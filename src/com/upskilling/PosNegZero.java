package com.upskilling;

import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num + "is positive");
		}
		else if(num<0) {
			System.out.println(num + "is negative");
			
		}
		else {
			System.out.println("The number is zero");
		}

	}

}
