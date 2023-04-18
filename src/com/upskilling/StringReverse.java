package com.upskilling;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse +=str.charAt(i);
		}
		System.out.println("The reverse of the string is:" + reverse);
	}

}
