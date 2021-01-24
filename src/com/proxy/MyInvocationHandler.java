package com.proxy;
import java.lang.reflect.*;
public class MyInvocationHandler implements InvocationHandler{
	private Object obj;
	public MyInvocationHandler (Object obj) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result;
		try {
			if(m.getName().indexOf("get")>-1)
				System.out.println(" Get");
			result=m.invoke(this.obj, args);
		}catch(Exception e) {
			throw e;
		}
		return result;
	}

}
