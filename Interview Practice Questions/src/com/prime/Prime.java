package com.prime;

public class Prime {
	
	public static void main(String[] args) {
		isPrime(22);
	}
	
	public static void isPrime(int num) {
		if(num<=1) {
			System.out.println("Enter valid number");
		}else {
			int factors = 0;
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					factors++;
				}
			}
			
			if(factors>1) {
				System.out.println("Not a prime number");
			}else {
				System.out.println("Prime Number");
			}
		}
	}

}
