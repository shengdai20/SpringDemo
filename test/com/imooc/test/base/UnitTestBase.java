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
			springXmlpath = "classpath*:spring-*.xml";//�����ļ�·��ͨ�����캯�����룬
		}
		try {
			context = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]+"));//����spring������context
			context.start();//��������������ļ��������õ���Ϣ����������Щ�ļ���Ȼ��װ�ص�spring�������ģ���context�
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
		return (T)context.getBean(beanId);//ͨ��getBean������ȡ��Ӧ�Ķ��󣬶������beanId���������д����oneInterface��Ҳ��spring-ioc.xml�ļ������ù���bean
	}
	
	protected <T extends Object> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}
	
}
