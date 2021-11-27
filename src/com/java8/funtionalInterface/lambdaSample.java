package com.java8.funtionalInterface;

public class lambdaSample  {
	
	//Runnable -> run method
	//callable -> call
	//comparable --> compareTo
	//comparator --> compare

	/*
	 * @Override // normal way public String functionalMethod() { // TODO
	 * Auto-generated method stub return " Override the Function method"; }
	 */

	public static void main(String agrs[]) {
		//System.out.println(" Using Lamda Functional method ");
		MyFunctional callFunctionalMethod =() -> {return " Using Lamda Functional method";}
		;
		
		System.out.println(callFunctionalMethod.functionalMethod());
		
		/*
		 * Calandar calander=(int a, int b)-> { return (a+b);} ;
		 * System.out.println("Return value from the add:"+ calander.add(5, 10));
		 */
		
		Calandar calander=(int a, int b, int c)-> a*b*c ;
		  System.out.println("Return value from the Multi:"+ calander.multi(5, 10,8));
	}
}
