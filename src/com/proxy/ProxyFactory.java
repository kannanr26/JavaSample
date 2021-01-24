package com.proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
Class className;
public static Object newInstance(Object ob,Class<?> class1) {
	return Proxy.newProxyInstance(ob.getClass().getClassLoader(),
			new Class<?>[] {class1}, new MyInvocationHandler(ob));
}
}
