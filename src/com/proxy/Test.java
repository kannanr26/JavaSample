package com.proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task=(Task) ProxyFactory.newInstance(new TaskImpl(),Task.class);
		System.out.println( task.getData());
	}

}
