package com.triumphs.java.assignment;

import java.util.Scanner;

public class SumOfPosNumbersUntilWeEnterPositive {

	public static void main(String[] args) {

//		int sum = withWhileLoop();
//		System.out.println("Sum of numbers using while loop: " + sum);

//		int sum = withDoWhileLoop();
//		System.out.println("Sum of numbers using Do-while loop: " + sum);
		
		int sum = withBreakStatement();
		System.out.println("Sum of numbers using while loop: " + sum);
	}

	private static int withWhileLoop() {
		int sum = 0;
		// create an object of Scanner class
		Scanner input = new Scanner(System.in);

		// take integer input from the user
		System.out.println("Enter a number");
		int number = input.nextInt();

		// while loop continues
		// until entered number is positive
		while (number >= 0) {
			// add only positive numbers
			sum += number;

			System.out.println("Enter a number");
			number = input.nextInt();
		}
		input.close();

		return sum;
	}

	private static int withDoWhileLoop() {
		int sum = 0;
		int number = 0;

		// create an object of Scanner class
		Scanner input = new Scanner(System.in);

		// do...while loop continues
		// until entered number is positive
		do {
			// add only positive numbers
			sum += number;
			System.out.println("Enter a number");
			number = input.nextInt();
		} while (number >= 0);

		input.close();

		return sum;
	}
	
	private static int withBreakStatement() {
		int sum = 0;
		int number = 0;

		// create an object of Scanner class
		Scanner input = new Scanner(System.in);

		// do...while loop continues
		// until entered number is positive
		while (true) {
			 System.out.print("Enter a number: ");
	            // takes double input from user
	            number = input.nextInt();
	         
	            // if number is negative the loop terminates
	            if (number < 0) {
	                break;
	            }
	         
	           sum += number;
		}

		input.close();

		return sum;
	}

}
