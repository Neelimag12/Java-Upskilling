package com.upskilling;

import java.util.Scanner;

public class IntLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println(i);
			
		}
		sc.close();
	}

}
