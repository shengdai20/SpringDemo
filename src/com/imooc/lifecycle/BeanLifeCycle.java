package com.imooc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
 * �����spring-lifecycle.xml��������Ĭ��initҲ������init-method������class��Ҳʵ���˽ӿڣ��������ַ��������ڵ�����£�Ĭ��init�ᱻ���ǣ���ִ���������ַ������ҽӿڻ���init-method֮ǰ
 * �����spring-lifecycle.xmlֻ������Ĭ��init��û������init-method��Ҳû��ʵ�ֽӿڣ�class��Ҳû�ж�Ĭ�ϵ�init����Ӧ�ķ���������Ĭ��init���ǻ����
 * */


//ʵ��InitializingBean��DisposableBean�����ӿڣ����Բ�����spring-lifecycle.xml�ļ���������init-method��destroy-method
public class BeanLifeCycle {//implements InitializingBean, DisposableBean{

	/*
	 * ��spring-lifecycle.xml��������Ĭ�ϵ�init��destroyʱ����Ҫʵ�ֵķ�������Ĭ�����õķ���������һ��
	public void defaultInit() {
		System.out.println("Bean defaultInit...");
	}
	
	public void defaultDestroy() {
		System.out.println("Bean defaultDestroy...");
	}
	*/
	
	
	/*
	 * ʵ�����������ӿ�ʱ��Ҫʵ�ֵķ�����
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean destroy...");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean afterProertiesSet...");
	}
	*/
	
	
	/*
	 * ��spring-lifecycle.xml�ļ��е�init-method��destroy-method���õ�������ͬ
	 * ��ִ��@Test֮ǰ�����context����������start������ر�context������������stop
	public void start() {
		System.out.println("Bean start...");
	}
	
	public void stop() {
		System.out.println("Bean stop...");
	}
	*/
}
