package com.Test1_logics;

public class Duplicate_char_from_STRING {

	public static void main(String[] args) {
		
		String str="I am Wishaal";
		
		 int count;    
         
         //Converting given string into character array    
         char strArray[] = str.toCharArray();    
     
         System.out.println(" Duplicate characters in a given string:  " );    
         //Counting each character present in the string    
         for(int i = 0; i <strArray.length; i++) {    
                 count = 1;    
             for(int j = i+1; j <strArray.length; j++) {    
                     if(strArray[i] == strArray[j] && strArray[i] != ' ') {    
                             count++;    
                             //Set strArray[j] to 0 to avoid printing visited character    
                             strArray[j] = '0';    
                     }    
                 }    
                 //A character is considered as duplicate if count is greater than 1    
                 if(count > 1 && strArray[i] != '0')    
                     System.out.println("Duplicate_char_is:" +strArray[i]+" "+ count + " times");    
         }    
         
         
         for(int i=0;i<str.length();i++) {
        	 
        	 
        	 
        	 
         }
         
         
         
         
         
         
         
         
         
         

	}

}
