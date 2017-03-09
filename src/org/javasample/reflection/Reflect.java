package org.javasample.reflection;

public class Reflect extends ReflectionA {

	public void methodNoParam(){
		System.out.println("No Param:::");
	}
	
	public void methodx(String  str){
		System.out.println("String :::"+str);
	}
	public void methodx(String  str, int value){
		System.out.println("String , INT :::::"+str+" :: "+value);
	}
	
	public void methodxy(String[]  str){
		System.out.println(" String Arr"+str[0]);
	}
	public void methodObj(Object  obj){
		System.out.println("Obj method ::"+obj.toString());
	}
	public void methodStrArr(String[]  obj){
		System.out.println("String  Array ::"+obj[0] );
	}
	
	public void methodObjArr(Object[]  obj){
		System.out.println("Object  Array ::"+obj[0].toString() );
		
	}
}
