package com.java.designpattern.factory;

public class Client {
	 public static void main(String[] args)
	    {
	        NotificationFactory notificationFactory = new NotificationFactory();
	        Notification notification = notificationFactory.createNotification("SMS");
	        notification.notifyUser();
	    }
}
