package com.Test1_logics;

public class StringBUFFER_StringBuilder_Class {

	public static void main(String[] args) {
		
		
		//String reverse using StringBuffer and StringBuilder Class
		
		String str="Java Manual Automation";
	
		StringBuffer sb=new StringBuffer(str);
		
		sb.append(" " + "Selenium");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		
		StringBuilder sb1=new StringBuilder(str);
		System.out.println(sb1.reverse());
		
		

	}

}
