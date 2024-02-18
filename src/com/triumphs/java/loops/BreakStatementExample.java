package com.triumphs.java.loops;

import com.triumphs.java.oop.MarutiCiaz;

public class BreakStatementExample {

	public static void main(String[] args) {
		// for loop
		for (int i = 1; i <= 30; ++i) {

			// if the value of i is 15 the loop terminates
			if (i > 10 && i < 20) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Loop is broken, this is next statement");
		
		MarutiCiaz ciaz = new MarutiCiaz();
		ciaz.braking();
//		ciaz.display();
		
		TataHarrier harrier = new TataHarrier();
		harrier.braking();
//		harrier.display();
		harrier.additionalDisplay();
	}

}
