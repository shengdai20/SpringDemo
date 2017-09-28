package com.imooc.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.beanannotation.BeanAnnotation;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {

	public TestBeanAnnotation() {
		super("classpath:spring-beanannotation.xml");
	}
	
	@Test
	public void testSay() {
		//��@Component�ж���bean������ʱ�������getBean���������������һ�£���û���壬��getBean�����������class����Сд����
		//BeanAnnotation bean = super.getBean("beanAnnotation");
		BeanAnnotation bean = super.getBean("bean");
		bean.say("This is test...");
	}
	
	@Test
	public void testScope() {
		//��@Scope�ж���Ϊprototypeʱ�����ε���getBean�ᷢ����������ͬ�Ķ��󱻴�����������Ϊsingletonʱ����ֻ�ᴴ��һ������
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.myHashCode();;
		
		bean = super.getBean("beanAnnotation");
		bean.myHashCode();;
	}

}
