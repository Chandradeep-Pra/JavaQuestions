package com.nissan.bean;

import java.util.Scanner;

public class SumOfDigitString {
	/*
	 * Calculate sum of digits from a string
	 */
	public static void main(String[] args) {
		//Initialising scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		String number = sc.nextLine();
		
		int sum = findDigitSumString(number);
		System.out.print("Sum of digits of the given number is : " + sum);
		sc.close();

	}

	private static int findDigitSumString(String number) {
		int total = 0;
		//Parsing the string to integer type
		int numNotString =  Integer.parseInt(number);
		
		//finding sum of digits
		while(numNotString > 0) {
			total+=numNotString%10;
			numNotString/=10;
		}
		return total;
	}

}
