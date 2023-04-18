package com.upskilling;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Integer:");
		int num1=sc.nextInt();
		System.out.println("Enter the second Integer:");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println(num1 + "is greater than" + num2);
		}
		else if(num1<num2) {
			System.out.println(num1 + "is smaller than" +  num2);
		}
		else{
			System.out.println(num1 + "is equal to" + num2);
			
		}

	}

}
