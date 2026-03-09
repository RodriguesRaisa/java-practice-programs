package com.javapractice;

import java.util.HashSet;

/*
 * Write a program to compare two arrays and find a common one. 
 */
public class IMPORTANT_WAP_Find_Common_Elements_In_Arrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr1)
        {
        	set.add(num);
        }
        
        for(int n : arr2)
        {
        	if(set.contains(n))
        	{
        		System.out.print(n+" ");
        	}
        }

	}

}
