package com.triumphs.java.loops;

public class ForEachloopExample {

	public static void main(String[] args) {
		// create an array
		int[] numbers = { 3, 9, 5, -5 };
		String[] names = {"Suhas", "Neelima", "Rahul"};

		System.out.println("For each loop");
		// for each loop
		for (int number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("For loop");
		for(int i = 0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		for (String name: names) {
			System.out.println(name);
		}
	}

}
