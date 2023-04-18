package com.upskilling;

import java.util.Scanner;

public class EvenNumLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int num=sc.nextInt();
	
			for(int i=2;i<=num;i+=2) {
				System.out.println(i);
			}
			sc.close();
		}

	}


