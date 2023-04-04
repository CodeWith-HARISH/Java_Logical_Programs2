package com.Test1_logics;

public class Print_last_char_fromSTRING {

	public static void main(String[] args) {
		
 
		
		String str="Application Programming Interface";
		
		String[] word=str.split(" ");
		
		int len=word.length;
		
		for(int i=0;i<len;i++) 
		{
			System.out.print(word[i].charAt(word[i].length()-1));
			
			
		}

	}

}
