package com.Test1_logics;

public class String_Reverse_differentWays {

	public static void main(String[] args) {
		
		String str="I am Hunter";
		
		int len=str.length();
		
		String Reverse="";
		
		//1) Using for loop
		
		for(int i=str.length()-1;i>=0;i--)
		{
			Reverse=Reverse+str.charAt(i);
		}
		
		System.out.println(Reverse);
		
		//2) Using while loop
		
		while(len>0)
		{
			
			len--;
			System.out.print(str.charAt(len));
			
		}
		
		System.out.println();
		
		//3) Using TocharArray()
		
		char[] arr=str.toCharArray();
		
		int j=arr.length;
		
		for(int k=j-1;k>=0;k--) 
		{
			
			Reverse=Reverse+str.charAt(k);
		
		}
		
		System.out.print(Reverse);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
