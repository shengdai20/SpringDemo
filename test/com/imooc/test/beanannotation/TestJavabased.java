package com.imooc.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.beanannotation.javabased.MyDriverManager;
import com.imooc.beanannotation.javabased.Store;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase{

	public TestJavabased() {
		super("classpath:spring-beanannotation.xml");
	}
	
	@Test
	public void test() {
		Store store = super.getBean("stringStore");
		System.out.println(store.getClass().getName());
	}
	
	@Test
	public void testMyDriverManager() {
		MyDriverManager myDriverManager = super.getBean("MyDriverManager");
		System.out.println(myDriverManager.getClass().getName());
	}
	
	@Test
	public void testScope() {
		Store store = super.getBean("store");
		System.out.println(store.hashCode());
		
		store = super.getBean("store");
		System.out.println(store.hashCode());
		
	}
	
//	@Test
//	public void testG() {
//		Store store = super.getBean("stringStoreTest");
//	}

}
