package com.Suhasini_Mohanty;

import org.apache.log4j.Logger;

public class Calculator {

	static Logger log = Logger.getLogger(Calculator.class.getName());
	
	public int addTwoNumbers(int a, int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
	    log.debug("Project Started Executing....");
	      
		Calculator cal=new Calculator();
		int result=cal.addTwoNumbers(5, 6);
		log.info("Result" + result);
		System.out.println(result);
	}
}
