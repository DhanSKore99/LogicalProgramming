package com.practice;

class Box {

}

public class A {

	public static void main(String[] args) {
		Box b1 = new Box();
		System.out.println("b1" + b1);

		Box b2 = b1;

		System.out.println("b2" + b2);

		System.out.println(b1.equals(b2));
		System.out.println("b1 hashcode" + b1.hashCode());
		System.out.println("b2 hashcode" + b2.hashCode());

		Box b3 = new Box();
		
		System.out.println("b3" +  b3);
		System.out.println(b1.equals(b3));
		System.out.println("b3 hashcode " + b3.hashCode());

	}
}
