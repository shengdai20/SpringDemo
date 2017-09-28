package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocBeanName implements BeanNameAware, ApplicationContextAware{// implements BeanNameAware {

	private String beanName;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContext:" + applicationContext.getBean(this.beanName).hashCode());
	}

	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("MoocBeanName:" + name);
	}

//	public void setBeanName(String name) {//���nameҲ����spring-aware.xml�����õ�bean��id������
//		System.out.println("MoocBeanName:" + name);
//	}

}
