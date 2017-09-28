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
		//当@Component中定义bean的名字时，这里的getBean里面的名字需与其一致，若没定义，则getBean里面的名字是class名的小写即可
		//BeanAnnotation bean = super.getBean("beanAnnotation");
		BeanAnnotation bean = super.getBean("bean");
		bean.say("This is test...");
	}
	
	@Test
	public void testScope() {
		//当@Scope中定义为prototype时，两次调用getBean会发现有两个不同的对象被创建；当定义为singleton时，则只会创建一个对象
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.myHashCode();;
		
		bean = super.getBean("beanAnnotation");
		bean.myHashCode();;
	}

}
