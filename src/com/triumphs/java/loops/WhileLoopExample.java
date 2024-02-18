package com.triumphs.java.loops;

public class WhileLoopExample {

	public static void main(String[] args) {
		// declare variables
		int i = 1, n = 10;

		System.out.println("Printing values using while loop");
		// while loop from 1 to 10
		while (i <= n) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println(" ");
		System.out.println("Printing values using for loop");
		// same example using for loop
		for(int j=1; j<=10; j++) {
			System.out.print(j + " ");
		}
	}

}
