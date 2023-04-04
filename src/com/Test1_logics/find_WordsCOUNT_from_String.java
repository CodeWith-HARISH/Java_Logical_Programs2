package com.Test1_logics;

public class find_WordsCOUNT_from_String {

	public static void main(String[] args) {
		
		String str="i am   Eng  ine  er";
		
		int count=1; 
		
		String[] ch=str.split(" ");
		
		for(int i=0;i<str.length();i++) 
		{
			
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') 
			{
				
				count++;
				
			}
			
			
		}
		
		System.out.println(count);
		
		
	}

}
