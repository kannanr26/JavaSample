package com.java.thread;

public class ClientRunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread runnableImpl=new RunnableThread("Text1.txt");
		  Thread thread1 = new Thread(runnableImpl, "Thread 1");
	        thread1.start();
	         
	}

}
