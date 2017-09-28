package com.imooc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
 * 如果在spring-lifecycle.xml既配置了默认init也配置了init-method，且在class中也实现了接口，在这三种方法都存在的情况下，默认init会被覆盖，而执行其他两种方法，且接口会在init-method之前
 * 如果在spring-lifecycle.xml只配置了默认init而没有配置init-method，也没有实现接口，class中也没有对默认的init有相应的方法，但是默认init还是会加载
 * */


//实现InitializingBean和DisposableBean两个接口，可以不用在spring-lifecycle.xml文件里面配置init-method和destroy-method
public class BeanLifeCycle {//implements InitializingBean, DisposableBean{

	/*
	 * 在spring-lifecycle.xml里面配置默认的init和destroy时，需要实现的方法名与默认配置的方法名保持一致
	public void defaultInit() {
		System.out.println("Bean defaultInit...");
	}
	
	public void defaultDestroy() {
		System.out.println("Bean defaultDestroy...");
	}
	*/
	
	
	/*
	 * 实现上面两个接口时所要实现的方法。
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
	 * 与spring-lifecycle.xml文件中的init-method和destroy-method配置的名字相同
	 * 在执行@Test之前会加载context容器，启动start，最后会关闭context容器，并调用stop
	public void start() {
		System.out.println("Bean start...");
	}
	
	public void stop() {
		System.out.println("Bean stop...");
	}
	*/
}
