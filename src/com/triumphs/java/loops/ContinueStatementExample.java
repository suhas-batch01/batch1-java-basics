package com.triumphs.java.loops;

public class ContinueStatementExample {

	public static void main(String[] args) {
		// for loop
		for (int i = 1; i <= 30; ++i) {

			// if value of i is between 10 and 20
			// continue is executed
			if (i > 10 && i < 20) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("This is next statement after continue");
	}

}
