package com.zhanghan.app;

public class Test {
	
	public static String dataTypeString;
	
	public static String ssoString ;
	
	public interface IData{
		String filename="111";
		String location="";
		String keyString="";
		int filesize=0;
	}
	
	
	public void readData(){
		
		
	}
	
	public void initData(){
		
		
	}
	
	
	public static void main(String a[]){
		IData idata = new IData() {
		};
		
		System.out.println(idata.filename);
		System.out.println("111");
	}
	
}
