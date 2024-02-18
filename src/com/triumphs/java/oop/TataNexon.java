package com.triumphs.java.oop;

public class TataNexon {

	// state or field
	private int gear = 5;
	private boolean isManual;

	// behavior or method
	public void braking() {
		System.out.println("Working of Braking..");
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

}
