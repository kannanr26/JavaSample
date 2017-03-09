package org.javasample.reflection;

public abstract class ReflectionA extends ReflectionB{
	
	public void reflectionPubMethod(){
		System.out.println(" In con Public  Method");
	}
	
	protected void reflectionProMethod(){
		System.out.println(" In con protected Method");
	}
	
	private void reflectionPriMethod(){
		System.out.println(" In con private Method");
	}

}
