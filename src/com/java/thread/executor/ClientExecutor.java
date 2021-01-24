package com.java.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 

public class ClientExecutor {

	 
	    public static void main(String args[])
	    {
	        ExecutorService es=Executors.newSingleThreadExecutor();
	 
	        for (int i = 1; i <= 3; i++) {
	        	MyThread loopTask=new MyThread("LoopTask "+i);
	            es.submit(loopTask);
	        }
	        es.shutdown();
	    }
	}