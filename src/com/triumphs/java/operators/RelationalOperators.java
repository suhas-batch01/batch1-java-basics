package com.triumphs.java.operators;

public class RelationalOperators {

	public static void main(String[] args) {
		// create variables
		int a = 12, b = 11;

		// value of a and b
		System.out.println("a is " + a + " and b is " + b);

		// == operator
		System.out.println("a == b: " + (a == b)); // false

		// != operator
		System.out.println("a != b: " + (a != b)); // true

		// > operator
		System.out.println("a > b: " + (a > b)); // false

		// < operator
		System.out.println("a < b: " + (a < b)); // true

		// >= operator
		System.out.println("a >= b: " + (a >= b)); // false

		// <= operator
		System.out.println("a <= b: " + (a <= b)); // true
		
		if (a < b) {
			System.out.println("a is less than b. ");
		} 
		if (a >=b ) {
			System.out.println("a is greater than or equal to b.");
		}
	}
}
