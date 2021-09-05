package com.Suhasini_Mohanty;

public class Calculator {

	public int addTwoNumbers(int a, int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		int result=cal.addTwoNumbers(5, 6);
		System.out.println(result);
	}
}
