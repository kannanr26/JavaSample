package com.java.designpattern.proxy;

public class TaskProxy implements Task {

	private Task taskObj= new TaskImpl(); 
	
	public int getItemNumber() {
		// TODO Auto-generated method stub
		return taskObj.getItemNumber();
	}

}
