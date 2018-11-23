package com.cg.mydemo.bean;

public interface MyInterface {


	default void hello() {
	
	System.out.println("Hello");
	
	}
	
	public static void hello1()
	{
		System.out.println("hello1");
	}
	
	
}
