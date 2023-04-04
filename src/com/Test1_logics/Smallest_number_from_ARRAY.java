package com.Test1_logics;

public class Smallest_number_from_ARRAY {

	public static void main(String[] args) {
		

		int[] arr= {10,20,50,80,70};
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min) 
			{
				min=arr[i];
				
			}
				
		}
		
		System.out.println("Smallest_number_form_givern_Array_is:"+min);
		

	}

}
