package org.javasample.reflection;

import java.util.Dictionary;
import java.util.Stack;

public abstract class ReflectionB {

	public void reflectionBPubMethod() {
		System.out.println(" In con Public  B Method");
	}

	protected void reflectionBProMethod() {
		System.out.println(" In con protected B Method");
	}

	private void reflectionBPriMethod() {
		System.out.println(" In con private Method");
	}

	public void switchToNewImpl(Object[] implRefs, Dictionary connections,
			Stack[] prvImplStack, String implementationClassForObject,
			Object parameter) throws Exception {
		System.out.println(" In SWITCH ");
	}
}
