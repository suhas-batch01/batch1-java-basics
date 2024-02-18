package com.triumphs.java.loops;

public class DoWhileLoopExample {

	public static void main(String[] args) {

		int i = 11, n = 10;

		// do...while loop from 1 to 10
		System.out.println("with do-while loop");
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= n);

		i = 11;
		n = 10;
		System.out.println(" ");
		System.out.println("with while loop");

		while (i <= n) {
			System.out.print(i + " ");
			i++;
		}
	}

}
