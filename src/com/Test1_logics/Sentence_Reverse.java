package com.Test1_logics;

public class Sentence_Reverse {

	public static void main(String[] args) {
		
		String str="I am Wishaal Chavan";
		
		
		System.out.println(str.length());
		
		String[] word=str.split(" ");
		
		for(int i=word.length-1;i>=0;i--)
		{
			
			
			System.out.print(word[i]+ " ");
			
			
		}

	}

}
