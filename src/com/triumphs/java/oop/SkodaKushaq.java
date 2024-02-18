package com.triumphs.java.oop;

public class SkodaKushaq extends Car {

	private int gear = 5;
	private boolean isManual;
	private String fuelType;
	private boolean hasSunroof;
	
	// behavior or method
	public void braking() {
		super.braking();
		System.out.println("Working of Braking in SkodaKushaq car..");
	}
	
	public void acceleration() {
		System.out.println("Working of accelerator..");
	}
	
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

	public boolean isHasSunroof() {
		return hasSunroof;
	}

	public void setHasSunroof(boolean hasSunroof) {
		this.hasSunroof = hasSunroof;
	}

}
