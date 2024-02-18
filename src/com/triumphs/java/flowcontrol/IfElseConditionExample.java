package com.triumphs.java.flowcontrol;

public class IfElseConditionExample {

	public static void main(String[] args) {
		int number = -1;

		// checks if number is greater than 0
		if (number > 0) {
			System.out.println("The number is positive.");
		}
		// Else execute this if number is not greater than 0
		else {
			System.out.println("The number is negative.");
		}

		System.out.println("Statement outside if...else block");
	}

}
