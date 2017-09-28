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
	 * ��Χ��singletonʱ��ֻ������һ������;����Χ��prototypeʱ����������������
	@Test
	public void testSay() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope1 = super.getBean("beanScope");
		beanScope1.say();
	}
	*/
	

	/*
	 * ��Χ��Ȼ��singleton�����Ƕ��ڵ�Ԫ������˵��ÿһ�����Է���ִ�е�ʱ�򶼻����һ��@Before��@After��������hashcode�᲻��ͬ��Ҳ����ÿһ�ζ�������һ������
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
