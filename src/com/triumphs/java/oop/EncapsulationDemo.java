package com.triumphs.java.oop;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// create object of Area
		// pass value of length and breadth
		Area rectangle = new Area(10, 20);
		
		rectangle.getArea();
		
		System.out.println(rectangle.getBreadth());
	}

}
