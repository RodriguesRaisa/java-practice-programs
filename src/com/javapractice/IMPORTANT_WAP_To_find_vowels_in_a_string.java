package com.javapractice;

public class IMPORTANT_WAP_To_find_vowels_in_a_string {

	public static void main(String[] args) {
		
		 String str = "Interview";
		 int count = 0;
		 char[] ch = str.toLowerCase().toCharArray();
		 for(char c:ch)
		 {
			 if(c =='a' || c=='e' || c=='i'|| c=='o'||c=='u')
			 {
				 System.out.println(c);
				 count++;
			 } 
		 }
		
		 System.out.println("Total vowels count is"+count);
	}

}
