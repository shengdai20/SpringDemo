package com.imooc.test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.bean.BeanScope;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {
	
	public TestBeanScope() {
		super("classpath*:spring-beanscope.xml");
	}

	/*
	 * 范围是singleton时，只会生成一个对象;而范围是prototype时，会生成两个对象
	@Test
	public void testSay() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope1 = super.getBean("beanScope");
		beanScope1.say();
	}
	*/
	

	/*
	 * 范围虽然是singleton，但是对于单元测试来说，每一个测试方法执行的时候都会加载一次@Before和@After，所以其hashcode会不相同，也就是每一次都会生成一个对象。
	@Test
	public void testSay1() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
	}
	
	@Test
	public void testSay2() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
	}
	*/
	
}
