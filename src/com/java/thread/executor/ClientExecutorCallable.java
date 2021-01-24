package com.java.thread.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 

public class ClientExecutorCallable {

	
	    public static void main(String args[])
	    {
	    	Future callBackReturn = null;
	        ExecutorService es=Executors.newSingleThreadExecutor();
	 
	        for (int i = 1; i <= 3; i++) {
	        	MyThread loopTask=new MyThread("LoopTask "+i);
	        	
	        	callBackReturn= es.submit(loopTask);
	        }
	        es.shutdown();
	        
	        try {
				System.out.println(" CAllBack return "+callBackReturn.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}