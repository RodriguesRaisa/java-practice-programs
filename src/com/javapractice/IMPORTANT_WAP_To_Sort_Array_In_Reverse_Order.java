package com.javapractice;

import java.util.Arrays;
import java.util.Collections;

/*
 * Sort array in reverse order
 */
public class IMPORTANT_WAP_To_Sort_Array_In_Reverse_Order {

	public static void main(String[] args) {
		
		Integer arr[] = {1,4,5,6,9};
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.println("Sorted array in reverse order is:"+Arrays.toString(arr));

	}

}
