package com.triumphs.java.operators;

public class InstanceofOperator {

	public static void main(String[] args) {
		String str = "Programiz";
		Boolean result;
		
		// checks if str is an instance of
		// the String class
		result = str instanceof String;
		System.out.println("Is str an object of String? " + result);
		
		Integer num = 10;
		System.out.println("Is num an object of Integer? " + (num instanceof Integer));
	}

}
