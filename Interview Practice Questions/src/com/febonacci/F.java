package com.febonacci;

public class F {
	public static void main(String[] args) {
		int number = 5;
		
		/*
		 * int a=0; int b=1; int c;
		 * 
		 * for(int i=0;i<number;i++) { System.out.println(a); c=a+b; a=b; b=c;
		 * 
		 * }
		 */
		
		int[] fibonacci = new int[number];
		fibonacci[0]=0;
		fibonacci[1]=1;
		
		for(int i=2;i<number;i++) {
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
			
		}
		
		for(int i=0;i<number;i++) {
			System.out.println(fibonacci[i]);
		}
		
		
		
	}

}
