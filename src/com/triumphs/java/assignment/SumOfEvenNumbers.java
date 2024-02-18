package com.triumphs.java.assignment;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int i = 1;
		int target = 10;
		int sum = 0;
		while (i <= target) {
			if(i %2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of even numbers is: " + sum);
	}

}
