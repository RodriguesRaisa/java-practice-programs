package com.javapractice;

import java.util.Arrays;

/*
 * a[] = {1, 3,2,5,4}; 
b[]={7,6,9,8,10}; 
Given two arrays, merge these two arrays into a single array without using inbuilt methods. 
 */

public class IMPORTANT_WAP_Merge_Two_Arrays_In_Single_Array_Without_Inbuilt_method {

	public static void main(String[] args) {
		
		int arr1[] = {1,3,2,5,4};
		int arr2[] = {7,6,9,8,10};
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		int mergedarr[] = new int[n1+n2];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				mergedarr[k++]= arr1[i++];
			}
			else
			{
				mergedarr[k++]= arr2[j++];
			}
		}
		
		while(i<n1)
		{
			mergedarr[k++]= arr1[i++];
		}
		
		while(j<n2)
		{
			mergedarr[k++]=arr2[j++];
		}
		
		System.out.println("Merged array is"+Arrays.toString(mergedarr));

	}

}
