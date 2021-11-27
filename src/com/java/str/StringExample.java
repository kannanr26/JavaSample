package com.java.str;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		if(str.equals(str1))
		{
			System .out.print(" equal");
		}
		if(str==str1)
		{
			System .out.print(" ==");
		}
		
		 String s3 =  new String("hello");
	        System.out.println(str == str1); // true
	        System.out.println(str1 == s3); // false
	        System.out.println(str1.equals(str)); // true
	        System.out.println(str1.equals(s3)); // true
	}

}
