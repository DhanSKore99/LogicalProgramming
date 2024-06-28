package com.prime;

public class PimeSeries {

	// find prime numbers between 0-10

	public static void main(String[] args) {
		findPrimeNumbers(100);
	}

	public static void findPrimeNumbers(int range) { // 10

		// boolean flag = false;

		int factors = 0;
		for (int i = 2; i <= range; i++) { // 2,3
			for (int j = 2; j <= i; j++) { // 2
				if (i % j == 0) {

					factors++; // 1
					// System.out.println(factors);
				}
				
			}
			if (factors == 1) {
				System.out.println(i);
				factors=0;
			}else {
				factors=0;
			}

		}

	}

}
