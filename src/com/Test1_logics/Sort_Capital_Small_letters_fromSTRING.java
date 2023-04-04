package com.Test1_logics;

public class Sort_Capital_Small_letters_fromSTRING {

	public static void main(String[] args) {
		
       String str="I am Wishaal AnD I am an Engineer";
		
       String Upper="";
       String Lower="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>=65 && ch<=90) 
			{
				
				Upper=Upper+ch;
				
			}
			else
			{
				
				Lower=Lower+ch;
				
			}
			
		}
		
		System.out.println("Capital letters:"+Upper);
		System.out.println("Small letters:"+Lower);
		
		

	}

}
