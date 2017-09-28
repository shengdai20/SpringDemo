package com.imooc.test.ioc.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.ioc.injection.service.InjectionService;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

	public TestInjection() {
		super("classpath:spring-injection.xml");
	}
	
	//��ֵע�����
	@Test
	public void testSetter() {
		InjectionService service = super.getBean("injectionService");
		service.save("this is the data that is saved...");
	}
	
	//����ע�����
	@Test
	public void testConstructor() {
		InjectionService service = super.getBean("injectionService");
		service.save("this is the data that is saved...");
	}

}
