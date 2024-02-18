package com.triumphs.java.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int februaryDays = 28;
	    String result;

	    // ternary operator
	    result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    
//	    if (februaryDays == 28) {
//	    	result = "Not a leap year";
//	    } else {
//	    	result = "Leap year";
//	    }
	    System.out.println(result);
	}

}
