package com.triumphs.java.oop;

public class OopExample {
	
	static final int count = 1;
	private static final String URI = "/api/employess/v1";

	public static void main(String[] args) {
//		Car car1 = new Car();
//		car1.setGear(3);
//		System.out.println("Car has these many gears: " + car1.getGear());
//		car1.braking();
//		Car.printCount();
//		
//		Car car2 = new Car();
//		System.out.println("Car has these many gears: " + car2.getGear());
//		car2.braking();
//		Car.printCount(); 
//		
//		Car car10 = new Car();
//		car10.setGear(2);
//		System.out.println("Car has these many gears: " + car10.getGear());
//		Car.printCount();

//		double sqrt = Math.sqrt(64.0);
//		System.out.println("Sqrt: " + sqrt);
		
		System.out.println("-------------");
		System.out.println("******Example of  inheritance******");
		MarutiCiaz ciaz = new MarutiCiaz();
		ciaz.display();
		System.out.println("******Example of method overriding******");
		ciaz.braking();
		
		// Superclass instance cannot access subclass properties or methods.
		Car car1 = new Car();
		car1.display();
		car1.braking();
//		car1.acceleration();
		
		System.out.println("******Example of method overriding with super keyword******");
		SkodaKushaq kushaq = new SkodaKushaq();
		kushaq.display();
		kushaq.braking();
		
		Area area = new Area(3, 4);
		area.getArea();
	}

}
