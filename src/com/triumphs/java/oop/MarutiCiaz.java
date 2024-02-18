package com.triumphs.java.oop;

public class MarutiCiaz extends Car {

	private int gear = 4;
	private boolean isManual;
	private String fuelType;

	// behavior or method - overridden method
	public void braking() {
		System.out.println("Working of Braking in MarutiCiaz car..");
	}

	void acceleration() {
		System.out.println("Working of accelerator..");
	}

	// cannot override final method from superclass
//	public void putHeadlightsOn() {
//		System.out.println("Headlights are on by default...");
//	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

}
