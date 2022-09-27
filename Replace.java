package com.nissan.bean;

import java.util.Scanner;

public class ReplaceIs {
	/*
	 * Replace every 'is' with 'is not' in a string
	 */
	public static void main(String[] args) {
		//Initialising scanner 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your sentence : ");
		String sentence = sc.nextLine();
		
		//Using replace function to replace is with is not and stroing it in a new string 
		String modifiedString = sentence.replace("is", "is not");
		
		//Printing new string 
		System.out.println(modifiedString);

	}

}
