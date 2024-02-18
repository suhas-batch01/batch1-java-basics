package com.triumphs.java.flowcontrol;

public class NestedIfElseExample {

	public static void main(String[] args) {
		// Lets say we want to identify who is the eldest among three persons
		int age1 = 5;
		int age2 = 45;
		int age3 = 55;

		int eldestAge;

		if (age1 > age2) {
			if (age1 > age3) {
				eldestAge = age1;
			} else {
				eldestAge = age3;
			}
		} else {
			if (age2 > age3) {
				eldestAge = age2;
			} else {
				eldestAge = age3;
			}
		}
		System.out.println("Eldest age among 3 person is : " + eldestAge);

	}

}
