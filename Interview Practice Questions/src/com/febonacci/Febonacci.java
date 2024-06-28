package com.febonacci;

public class Febonacci {
	/*
	 * public static void main(String[] args) { int n = 10; // Number of Fibonacci
	 * numbers to generate
	 * 
	 * System.out.println("Fibonacci Series up to " + n + " numbers:"); for (int i =
	 * 0; i < n; i++) { //i=0,1,2,2
	 * 
	 * System.out.print(fibonacci(i) + " "); //print=0,1,1, } }
	 * 
	 * public static int fibonacci(int n) { //n=0,1,2,2 if (n <= 1) { return n; //
	 * Base cases: F(0) = 0, F(1) = 1 } else { return fibonacci(n - 1) + fibonacci(n
	 * - 2); // Recursive case: F(n) = F(n-1) + F(n-2) } }
	 */

	
		public static void main(String[] args) {
			int n = 10; // Number of Fibonacci numbers to generate

			System.out.println("Fibonacci Series up to " + n + " numbers:");

			int[] fib = new int[n];
			fib[0] = 0;
			fib[1] = 1;

			for (int i = 2; i < n; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}

			for (int i = 0; i < n; i++) {
				System.out.print(fib[i] + " ");
			}
		}
	}


