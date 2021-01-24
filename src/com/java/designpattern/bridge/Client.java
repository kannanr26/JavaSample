package com.java.designpattern.bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Component compA=new ComponentA(new TaskA());
		Component compB=new ComponentA(new TaskB());
	compA.move();
	compB.move();
	
	Component compC=new ComponentA(new TaskA());
	}

}
