package com.java.str;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="abcdef";
		String str3="ab cdef";
		String str2="ab";
		

		strCompare(str1,str2);
		System.out.println("Region Compare "+str3.regionMatches(true, 0, str2, 0, 2));
	}

	private static void strCompare(String str1, String str2) {
		// TODO Auto-generated method stub
		char[] charAry=str1.toCharArray();

		char[] charAry1=str2.toCharArray();
		int charLng=charAry.length;
		int charLng1=charAry1.length;
		int matchCount=0;
		for(int i=0;i<charLng1;i++) {

			if(charAry[i]==charAry1[i]) {
				matchCount++;
			
			}
			else
				break;
			
			
		//}
			
	}
		if(matchCount==charLng1) 
			System.out.println(" ISMATCH");
		
		else
			System.out.println(" NOT MATCH");
			
	}

}
