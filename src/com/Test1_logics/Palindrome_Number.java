package com.Test1_logics;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		int num=111;
		int rev=0;
		int rem=0;
		int rev1=num;
		
		while(num>0)
		{
			
			rem=num%10;
			rev=rev*10 +rem;
			num=num/10;
			
		}
		
		if(rev1==rev)
		{
			
			System.out.println("Yes this is Palindrome number:"+rev);
		
		}
		else 
		{
			
			System.out.println("this is not Palindrome number:"+rev);
			
		}
		
		

	}

}
