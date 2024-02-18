package com.triumphs.java.loops;

public class ForEachAssignment {

	public static void main(String[] args) {
		String name = "Suhas";
		
		System.out.println("Characters in my name: " );
		for(int i = 0; i <name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	}

}
