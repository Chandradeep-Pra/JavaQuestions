package com.nissan.bean;

import java.util.Scanner;

public class RemoveHash {
	/*
	 * Read a string and return after removing the # and its immediate left and
	 * rigth characters
	 */
	public static void main(String[] args) {
		// Initialising scanner class
		Scanner sc = new Scanner(System.in);
		
		//Taking input and declaring variables if required
		System.out.print("Enter the string : ");
		String sentence = sc.nextLine();
		
		System.out.print("String after the modification is : "+modifyIt(sentence));

	}

	private static String modifyIt(String sentence) {
		String ansString = "";
		int currStartInd = 0;
		// Logic 
		// To iterate over string and wherever # is encountered then generate a substring from starting to 
		// index where # was found
		for(int i=0;i<sentence.length();i++){
			if(sentence.charAt(i) == '#') {
				ansString+=sentence.substring(currStartInd, i-1);
				currStartInd = i+2;
			}
		}
		
			ansString+=sentence.substring(currStartInd);
		
		return ansString;
	}

}
