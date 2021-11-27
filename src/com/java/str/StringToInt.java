package com.java.str;

public class StringToInt {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="123";
		int zeroASCII=(int)'0';
		System.out.println("Zero ASCII:"+ zeroASCII);
		System.out.println("ASCII of a:"+ (int)'a');
		System.out.println("ASCII of A:"+ (int)'A');
		System.out.println(" ASCII at 0th position:"+ (int) str.charAt(0));
		int value=0;
		
		for(int i=0; i<str.length();i++) 
		value=value*10 + (str.charAt(i)-zeroASCII);
		
		System.out.println("Value="+value);
	}

}
