package com.sampath;

public class Swap {

	public static void main(String[] args) {
		double a= 10;
		double b= 20;
//		double temp;
//		System.out.println("Before swapping");
//		System.out.println(a);
//		System.out.println(b);
//		temp = a;
//		a=b;
//		b=temp;
//		System.out.println("After ");
//		System.out.println(a);
//		System.out.println(b);
		System.out.println("Before..");
		System.out.println(a);
		System.out.println(b);
		a=b+a;
		b=a-b;
		a=a-b;
		System.out.println("After..");
		System.out.println(a);
		System.out.println(b);
}

}
