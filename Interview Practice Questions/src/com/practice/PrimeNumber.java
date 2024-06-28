package com.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		findPrimeNumber(number);

	}

	public static void findPrimeNumber(int number) {
		int factor = 0;

		if (number <= 1) {
			System.out.println("Enter Valid Number");
		} else {

			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					factor = factor + 1;
				}

			}
			
			if(factor==1) {
				System.out.println("Prime");
			}else {
				System.out.println("composite");
			}
			
			
		}

	}

}
