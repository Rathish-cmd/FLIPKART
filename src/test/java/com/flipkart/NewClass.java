package com.flipkart;

public class NewClass {

	public static void main(String[] args) {
		
		TestClass test = TestClass.instance();
		System.out.println(System.identityHashCode(test));
		
		TestClass test1 = TestClass.instance();
		System.out.println(System.identityHashCode(test1));
		
		TestClass test2 = TestClass.instance();
		System.out.println(System.identityHashCode(test2));
		
		TestClass test3 = TestClass.instance();
		System.out.println(System.identityHashCode(test3));
		
		TestClass test4 = TestClass.instance();
		System.out.println(System.identityHashCode(test4));
		
	}
}
