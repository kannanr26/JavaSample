package com.java.thread.executor;

import java.util.concurrent.Callable;

public class MyThread  implements Callable {
 private final String fileName;
	 
	 public MyThread(String fileName) {
	  super();
	  this.fileName = fileName;
	 }
	 
	
	 public String getFileName() {
	  return fileName;
	 }
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return fileName+"Thread Callable"+Math.random();
	}
}
