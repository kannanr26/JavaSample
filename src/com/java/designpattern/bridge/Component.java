package com.java.designpattern.bridge;

public abstract class Component implements Task {

	public Task task;
	
	public  Component( Task task) {
		this.task = task;
	}
	//abstract public void getComponent();
	abstract public void move();
}
