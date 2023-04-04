package com.Test1_logics;

public class WhiteSpace_count {

	public static void main(String[] args) {
		
		String str="I am  Wishaal";
		
		int Spsce_count=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch==' ') 
			{
				
				Spsce_count++;
				
			}
			
		}
		
		System.out.println(Spsce_count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
