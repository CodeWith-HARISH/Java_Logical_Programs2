package com.Test1_logics;

public class Swapping_NUmbers {

	public static void main(String[] args) {
		
		//Swapping 2 numbers without using 3rd variable
		
		int a=10;
		int b=20;
		
		System.out.println("Numbers Before Swapping:"+a);
		System.out.println("Numbers Before Swapping:"+b);
		
		a=a+b; //30
		b=a-b; //10
		a=a-b; //20
		
		System.out.println("Numbers After Swapping:"+a);
		System.out.println("Numbers After Swapping:"+b);
		
		
		
		
		//Using 3rd Variable
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("Numbers After Swapping:"+a);
		System.out.println("Numbers After Swapping:"+b);
		
		
		//Using * an / operator
		a=a*b; //200
		b=a/b; //10
		a=a/b; //20
		
		System.out.println("Numbers After Swapping:"+a);
		System.out.println("Numbers After Swapping:"+b);
		
		
		
		
		
		

	}

}
