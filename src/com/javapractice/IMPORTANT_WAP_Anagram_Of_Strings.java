package com.javapractice;

import java.util.Arrays;

public class IMPORTANT_WAP_Anagram_Of_Strings {

	public static void main(String[] args) {
		
		String str1 = "LISTEN";
		String str2 = "JAVAWA";
		
		if(str1.length() !=str2.length())
		{
			System.out.println("Strings are not anagrams");
			return;
		}
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagrams");
		}
		
	}
}
