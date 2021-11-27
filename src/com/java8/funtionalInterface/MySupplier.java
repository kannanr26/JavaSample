package com.java8.funtionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MySupplier {


		public static void main(String args[])
		{
			
			Supplier<String> supplier=()->"Welcome , Functional Interface";
			System.out.println(supplier.get());
			
			List<String> list =Arrays.asList("a\\h","b","c","d","e","f","g","h","i","j","k","l");
	    	System.out.println(list.stream().findFirst().orElseGet(supplier));

	    	List<String> list2 =Arrays.asList();
	    	System.out.println(list2.stream().findFirst().orElseGet(supplier));

			// This function returns a random value.
			Supplier<Double> randomValue = () -> Math.random();

			// Print the random value using get()
			System.out.println(randomValue.get());
		}
	}

