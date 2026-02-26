package com.javapractice;

import java.util.Scanner;

public class WAP_Check_if_Palindrome_Number_Or_Not {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num; // store original number
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        // Check if palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is NOT a palindrome number.");
        }

        sc.close();
	}

}
