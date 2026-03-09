package com.javapractice;

/*
 * Program: How do you sort an array program in Java? 
 */
public class IMPORTANT_WAP_To_Sort_An_Array {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		
		boolean isSorted = true;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				isSorted = false;
				break;
			}
		}
		
		if(isSorted)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}

	}

}
