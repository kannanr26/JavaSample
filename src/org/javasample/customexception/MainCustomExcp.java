package org.javasample.customexception;

public class MainCustomExcp {

	public static void main(String[] args){
	try{
		MainCustomExcp.myTest(null);
		
    } catch(CustomException cex){
        System.out.println("Inside catch block: "+cex.getMessage());
    }finally {
    	try {
			MainCustomExcp.myTest("Sample");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
    static void myTest(String str) throws CustomException{
        if(str == null){
            throw new CustomException("String val is null");
        }else{
        	System.out.println("Value : "+str);
        }
    }

}
