package com.nissan.bean;

import java.util.Scanner;

public class MarksAverage {
	/*
	 * Enter the marks of 10 students and find out the average
	 */
	public static void main(String[] args) {
		// Intialising scanner calss
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		
		//Taking inputs for array's element
		for(int i=0;i<10;i++) {
			System.out.print("Enter the marks of student number " + (i+1)+" : ");
			array[i]=sc.nextInt();
		}
			System.out.println("Average marks of the students are   : " + findAvg(array));

	}

	private static int findAvg(int[] array) {
		int totalMarks=0;
		for(int i=0;i<10;i++) {
			totalMarks+=array[i];
		}
		return totalMarks/10;
	}

}
