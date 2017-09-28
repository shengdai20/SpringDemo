package com.imooc.beanannotation.javabased;

public class StringStore implements Store<String> {

	public void init() {
		System.out.println("this is init...");
	}
	
	public void destroy() {
		System.out.println("this is destroy...");
	}
}
