package com.upskilling;

public class AllOperators {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c=6;
		int d=(a<b)?a:b;

		//a +=4; // shortcut for incrementing the number by itself
		//a = a+6;
		//a++;//fetch the value and then increment
		//a--;
		//++a;//increment the value and then fetch the value
		//--a;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);//relational operators
		System.out.println(a>>b);
		System.out.println(b<<a);//shift operators
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(a|b);//bitwise operators
		System.out.println(a>b&&a<c);
		System.out.println(a==b||a==c);//logical operator
		System.out.println(d);
		

	} 

}
