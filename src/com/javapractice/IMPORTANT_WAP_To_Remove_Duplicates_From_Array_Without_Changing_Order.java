package com.javapractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*
 * Program to Remove duplicates from Array without changing the order? 
input: int [] arr = {5,6,7,3,3,7,5}; 
output: arr = {5,6,7,3}; 

* Write a program to find the repeated number in a series of numbers. 
 */
public class IMPORTANT_WAP_To_Remove_Duplicates_From_Array_Without_Changing_Order {

	public static void main(String[] args) {
		
		int arr[] = {5,6,7,3,3,7,5};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int num:arr)
		{
			set.add(num);
		}
		
		//converting set to array again
		int arr1[] = new int[set.size()];
		
		int index = 0;
		
		for(int n:set)
		{
			arr1[index++]=n;
		}

		System.out.println("Array with no duplicates"+Arrays.toString(arr1));
	}

}
