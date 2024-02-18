package com.triumphs.java.operators;

public class AssignmentOperators {

	// Always use assignment operators when you want to compute something (between two variables) & assign the 
	// result back to the same variable 
	public static void main(String[] args) {
		// create variables
	    int a = 400;
	    int var;

	    // assign value using =
	    var = a;
	    System.out.println("var using = " + var); // var = 400

	    // assign value using +=
	    var += 50; //equivalent to var = var + 50 = 450
//	    int finalValue = var + 50;
	    System.out.println("var using += " + var);
	    
	    // assign value using -=
	    var -= 50; //equivalent to var = var - 50 = 450 - 50 = 400
	    System.out.println("var using -= " + var);
	    
	    // assign value using =/
	    var /= 40; // equivalent to var = var / 40 = 400 * 40 = 
	    System.out.println("var using /= " + var);

	    // assign value using *=
	    var *= a; // equivalent to var = var * a = 10 * 400 = 
	    System.out.println("var using *= " + var);


	}

}
