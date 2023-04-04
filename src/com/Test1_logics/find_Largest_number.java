package com.Test1_logics;

public class find_Largest_number {

	public static void main(String[] args) {
	
		//Using if-else-if
		
		int a=10;
		int b=50;
		int c=70;
		
		if(a>b && a>c) 
		{
			
			System.out.println("A is greater than B and C:"+a);
			
		}
		else if(b>a && b>c) 
		{
			
			System.out.println("B is greater than A and C:"+b);
			
		}
		else
		{
			
			System.out.println("C is greater than A and B:"+c);
			
		}
		
		
		
		//without if-else-if
		
		int largest1=a>b?a:b;
		int largest2=largest1>c?largest1:c;
		
		System.out.println(largest2);
		
		
		
		
		
		
		
		
		

	}

}
