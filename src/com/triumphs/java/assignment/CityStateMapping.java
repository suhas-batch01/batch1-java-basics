package com.triumphs.java.assignment;

public class CityStateMapping {

	public static void main(String[] args) {
		String city = "Chennai";
		String state;

		if (city == "Pune" || city == "Mumbai") {
			state = "Maharashtra";
		} else if (city == "Hyderabad") {
			state = "Telangana";
		} else if (city == "Chennai") {
			state = "Tamil Nadu";
		} else if (city == "Bangalore") {
			state = "Karnataka";
		} else {
			state = "Default city";
		}
		System.out.println("State of the provided city is: " + state);
	}

}
