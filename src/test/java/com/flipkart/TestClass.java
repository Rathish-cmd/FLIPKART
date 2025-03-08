package com.flipkart;

public class TestClass {
	
	static TestClass tc = null;
	
	static public TestClass instance() {
		if(tc == null) {
			tc = new TestClass();
		}
		return tc;
	}
	
	public static void main(String[] args) {
		
		TestClass test = instance();
		System.out.println(System.identityHashCode(test));
		
		TestClass test1 = instance();
		System.out.println(System.identityHashCode(test1));
		
		TestClass test2 = instance();
		System.out.println(System.identityHashCode(test2));
		
		TestClass test3 = instance();
		System.out.println(System.identityHashCode(test3));
		
		TestClass test4 = instance();
		System.out.println(System.identityHashCode(test4));
	}
}
