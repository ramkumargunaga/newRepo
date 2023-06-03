package com.ty.jsp;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public void mult(int a, int b) {
		System.out.println(a*b);
	}
	
	public void div(int a, int b) {
		
		if (a!=0 && b!=0) {
			System.out.println(a/b);
		}
		System.out.println("provide non-zero number");
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(25, 5);
		calculator.sub(25, 5);
	}

}
