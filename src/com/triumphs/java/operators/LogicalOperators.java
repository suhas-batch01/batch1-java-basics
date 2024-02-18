package com.triumphs.java.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// && operator
		System.out.println((50 > 30) && (80 > 50)); // true
		System.out.println((50 > 30) && (80 < 50)); // false

		// || operator
		System.out.println((50 < 30) || (80 > 50)); // true
		System.out.println((50 > 30) || (80 < 50)); // true
		System.out.println((50 < 30) || (80 < 50)); // false

		// ! operator
		System.out.println(!(50 == 30)); // true
		System.out.println(!(50 > 30)); // false
		
//		value > 35 , then print pass
//		if value > 35 & less than 60, then print second class
//		if value > 60 & less than 70 , then print first class
//		if value > 70 & less than 80, then print first class with distinction
//		if value > 80, then print Excellent
		
		
	}

}
