package com.snowbirdit;

import com.snowbirdit.corejava.Calculator;

public class CoreJavaMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Core Java App running");
		int sum ;
		
		Calculator calculator = new Calculator();
		sum = calculator.addInt(6, 8);
				
		System.out.println("6+8 = " + sum);

	}

}
