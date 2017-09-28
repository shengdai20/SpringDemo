package com.imooc.test.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;


public class UnitTestBase {
	private ClassPathXmlApplicationContext context;
	private String springXmlpath;
	public UnitTestBase() {};
	
	public UnitTestBase(String springXmlpath) {
		this.springXmlpath = springXmlpath;
	}
	
	@Before
	public void before() {
		if(StringUtils.isEmpty(springXmlpath)) {
			springXmlpath = "classpath*:spring-*.xml";//配置文件路径通过构造函数传入，
		}
		try {
			context = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]+"));//创建spring的容器context
			context.start();//启动后查找配置文件里面配置的信息，并解析这些文件，然后装载到spring的上下文，即context里，
		} catch(BeansException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void after() {
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId) {
		return (T)context.getBean(beanId);//通过getBean方法获取相应的对象，而这里的beanId即是子类中传入的oneInterface，也在spring-ioc.xml文件中配置过的bean
	}
	
	protected <T extends Object> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}
	
}
