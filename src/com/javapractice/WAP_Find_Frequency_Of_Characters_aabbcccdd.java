package com.javapractice;

/*
 * Write a program to count the frequency of each character in a
 *  given string using a Java Map. 
 * Then, print only those characters whose frequencies are even. 
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class WAP_Find_Frequency_Of_Characters_aabbcccdd {
	
	public static void main(String[] args)
	{
		String str = "aabbcccdd";
		
		if (str == null || str.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

		char[] ch = str.toCharArray();
		
		 Map<Character, Integer> map = new LinkedHashMap<>(); // preserves order 
		 
		// Count frequency of each character
	        for (char c : ch) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }
	     
	     // Build compressed string using StringBuilder
	        StringBuilder sb = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            sb.append(entry.getKey()).append(entry.getValue());
	        }

	        System.out.println("Input: " + str);
	        System.out.println("Compressed Output: " + sb.toString());
		
	}

}
