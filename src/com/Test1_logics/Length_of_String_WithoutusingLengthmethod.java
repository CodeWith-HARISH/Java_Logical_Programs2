package com.Test1_logics;

public class Length_of_String_WithoutusingLengthmethod {

	public static void main(String[] args) {


		String str="Harish";
		int count=0;
		
		char[] b =str.toCharArray();
		
		for(char ch:b)
		{
			
			count++;
			
		}
		
		System.out.println(count);
		

	}

}
