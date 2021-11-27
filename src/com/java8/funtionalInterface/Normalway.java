package com.java8.funtionalInterface;

public class Normalway implements MyFunctional {

	// Runnable -> run method
	// callable -> call
	// comparable --> compareTo
	// comparator --> compare

	@Override // normal way 
	public String functionalMethod() 
	{ 
		return" Override the Function method";
	}

	public static void main(String agrs[]) {

		MyFunctional fnMethod = new Normalway();
		System.out.println(fnMethod.functionalMethod());
	}
}
