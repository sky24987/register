package com.zhanghan.app;

public class StringSplit {

	public  void doSome(String theMessage){
		
		String[] result = theMessage.split(" ", 3);
		String status = result[1];
		String theCommand = result[0];
		
	}
	
}
