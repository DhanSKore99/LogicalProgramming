package com.practice;

public class FindPrime {
	public static void main(String[] args) {
		int number = 123;
		int originalNumber=number;
		int tempNumber = number;
		int noOfDigits = 0;
		
		while (tempNumber != 0) {//371,37,3
			tempNumber = tempNumber / 10; // 37,3
			noOfDigits++; // 1
			}
		
		System.out.println("value of temp number after while loop: " + tempNumber );
		System.out.println("value of  number after while loop: " + number );
		System.out.println("No of digits: " + noOfDigits);
		
		int finalNumber=0;
		int remainder;
		
		
		while(number>0) {
			remainder = number%10;  //1,7,3
			System.out.println(remainder);
			finalNumber = (int)(Math.pow(remainder, noOfDigits))+finalNumber;  //3, 346 ,
			
			number = number/10;  //371->37->3
		}
		System.out.println("originalNumber: " + originalNumber);
		System.out.println( "finalNumber: " + finalNumber);
		
		if(originalNumber==finalNumber)
		{
			System.out.println("ArmStrong Number.");
		}
		else
		{
			System.out.println("Not a ArmStrong Number");
		}


	}

}


