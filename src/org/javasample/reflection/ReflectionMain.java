package org.javasample.reflection;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Stack;

public class ReflectionMain {

	public static void main(String[] args){
		
		try {
			Class refClass=  Class.forName("reflection.Reflect");
			Object redObj=refClass.newInstance();
			
			Method callMethod1=refClass.getDeclaredMethod("methodNoParam",new Class[]{});
			callMethod1.invoke(redObj, null);
			
			Method callMethod=refClass.getDeclaredMethod("methodx", String.class);
			callMethod.invoke(redObj, "REFLECTION");
			
			
			
			Method callMethod2=refClass.getDeclaredMethod("methodx", String.class, int.class);
			callMethod2.invoke(redObj, "REFLECTION",10);
			
			Method callMethod3=refClass.getDeclaredMethod("methodObj", Object.class);
			callMethod3.invoke(redObj, new ReflectionMain() );
			
		
			
		String[] strObj={new String()};
		String[] str={"HCL", "REFLECTION"};
			Method callMethod4=refClass.getDeclaredMethod("methodStrArr",  strObj.getClass());
			callMethod4.invoke(redObj,new Object[]{str} );
			 
			
			Object[] objO ={new Object()};
			Object[] obj ={new ReflectionMain()};

			Method callMethod5=refClass.getDeclaredMethod("methodObjArr",  objO.getClass());
			callMethod5.invoke(redObj,new Object[]{obj} );
		//	refClass.methodx("REFLECTION");
			
			Method callReflectionPubMethod=refClass.getSuperclass().getDeclaredMethod("reflectionPubMethod",new Class[]{});
			callReflectionPubMethod.invoke(redObj, null);
			
			Method callReflectionProMethod=refClass.getSuperclass().getDeclaredMethod("reflectionProMethod",new Class[]{});
			callReflectionProMethod.invoke(redObj, null);
			
			
			Method callReflectionBPubMethod=refClass.getSuperclass().getSuperclass().getDeclaredMethod("reflectionBPubMethod",new Class[]{});
			callReflectionBPubMethod.invoke(redObj, null);
			
			Method callReflectionBProMethod=refClass.getSuperclass().getSuperclass().getDeclaredMethod("reflectionBProMethod",new Class[]{});
			callReflectionBPubMethod.invoke(redObj, null);
			
			  Object[] objArray ={new Object()};
	            Stack[] stkArray ={new Stack()};
	            Stack[] prvImplStack   = new Stack[1];
	            Class noparams[] = {};
		/*	Method callReflectionPriMethod=refClass.getSuperclass().getDeclaredMethod("reflectionPriMethod",new Class[]{});
			callReflectionPriMethod.invoke(redObj, null);*/
			Method callReflectionSwitchProMethod=refClass.getSuperclass().getSuperclass().getDeclaredMethod("switchToNewImpl",objArray.getClass() , Dictionary.class,stkArray.getClass(),String.class,Object.class);
			callReflectionSwitchProMethod.invoke(redObj,new Object[]{new ReflectionMain()},new Hashtable(), prvImplStack,"HCL",null);
                  
                  
			
			
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/*public String toString(){
		return " In Class Reflect Main";
		
	}*/
}
