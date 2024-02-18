package com.triumphs.java.flowcontrol;

public class SwitchCaseExample {

	public static void main(String[] args) {
		int number = 44;
		String tshirtSize;

		// switch statement to check size
		switch (number) {

		case 38:
			tshirtSize = "Small";
			break;

		case 40:
			tshirtSize = "Medium";
			break;

		case 42:
			tshirtSize = "Large";
			break;

		case 44:
			tshirtSize = "Extra Large";
			break;

		default:
			tshirtSize = "Unknown";
			break;

		}
		System.out.println("TshirtSize: " + tshirtSize);
	}

}
