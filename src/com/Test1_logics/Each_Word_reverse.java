package com.Test1_logics;

public class Each_Word_reverse {

	public static void main(String[] args) {
		
		String str="Hey Java API";
		
		String RevString="";	
		
		String[] words=str.split(" ");
		
		for(int i=0;i<words.length;i++) 
		{
			
			String ch=words[i];
			
			String revWord="";
			for(int j=ch.length()-1;j>=0;j--) {
				
				revWord=revWord+ch.charAt(j);
				
				
			}
			
			RevString=RevString+revWord+ " ";
			
			
		}
		
		System.out.println(RevString);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
