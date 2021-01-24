package com.java.designpattern.proxy;

public class TaskClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task taskProxy=new TaskProxy();
		System.out.println(taskProxy.getItemNumber());
	}

}
