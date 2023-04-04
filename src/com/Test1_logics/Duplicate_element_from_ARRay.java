package com.Test1_logics;

public class Duplicate_element_from_ARRay
{

	public static void main(String[] args)
	{
		
		
		
		
		int[] arr= {50,40,40,5,23,50};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				
				if(arr[i]==arr[j]) 
			    {
					
					System.out.println("Duplicate numbers are :" + arr[j]);
					break;
					
				}
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
