package com.Test1_logics;

public class find_Prime_Number {

	public static void main(String[] args) {
		
		
		int num=3;
		
		int count=0;
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				
				count++;
				
			}
		}
			
		if(count==2) {
			
			System.out.println("this is Prime number:"+ num);
			
		}	
		else{
			
			System.out.println("this is not Prime number:"+ num);
			
		}	
			
			
			
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
