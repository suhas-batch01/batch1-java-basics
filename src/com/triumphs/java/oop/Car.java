package com.triumphs.java.oop;

public class Car {

	protected int gear = 5;
	private static int count = 1;
	private ElectronicBraking eb;
	private Object[] labels;
	
	protected void display() {
		System.out.println("This is display inside the Car");
	}

	public static void printCount() {
		System.out.println("count: " + count);
	}

	public final void putHeadlightsOn() {
		System.out.println("Headlights are on by default...");
	}

	public void braking() {
		System.out.println("Working of Braking..");
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

}
