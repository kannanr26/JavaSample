package com.java.str;

public class StrParaser {

	public StrParaser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jsonStr= "{setOfStrings\": [ {\"value\": \"comcast\"}, {\"value\": \"communicate\"},{\"value\": \"commutation\"}] }";
		
		int indexArrayStart=jsonStr.indexOf('[');
		int indexArrayStop=jsonStr.indexOf(']');
		
		String arrStr=jsonStr.substring(indexArrayStart+1,indexArrayStop);
		String[] keyValueArr=arrStr.split(",");
		String[] returnString = new String[keyValueArr.length];
		boolean isValidInput=true;
		
		for (int i=0;i<keyValueArr.length;i++) {
		//	System.out.println(keyValueArr[i]);
			
			
			int indexStart=keyValueArr[i].indexOf('{');
			int indexStop=keyValueArr[i].indexOf('}');
			
			String valueStr=keyValueArr[i].substring(indexStart+1,indexStop);
			
			String[] strValue=valueStr.split(":");
			
	//System.out.println(":::"+);
			String key=strValue[0].replaceAll("\"", "");
			String val=strValue[1].replaceAll("\"", "");
			
			if(key.trim().equalsIgnoreCase("value")) {
				System.out.println(" Key Present");
				
			}else {
				System.out.println(" Key is not present");
				isValidInput=false;
				
			}
			System.out.println("::"+val);
			if(val.trim().isEmpty()==false) {
				returnString[i]=val;
			}else {
				isValidInput=false;
				
			}
			
			if(!isValidInput)
				break;

		}

		if(isValidInput) {
		for (String string : returnString) {
			System.out.println(string);
		}
		}else {
			System.out.println(" Parse Error: invalid input");
		}
	}

}
