package org.javasample.customexception;

public class CustomException extends Exception {

	private String msg=null;
	public CustomException(){
		super();
	}
	public CustomException(String msg){
		super(msg);
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
