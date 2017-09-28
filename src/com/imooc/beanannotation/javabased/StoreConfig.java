package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {
	
//	//@Value里的值应该与properties里的key相对应
//	@Value("${url}")
//	private String url;
//	
//	//username会取当前登录的本电脑的操作系统的名称
//	//@Value("${username}")
//	@Value("${jdbc.username}")
//	private String username;
//	
//	@Value("${password}")
//	private String password;
//	
//	@Bean
//	public MyDriverManager MyDriverManager() {
//		return new MyDriverManager(url, username, password);
//	}

	
	
//	@Bean(name = "store")
//	//指定bean的范围和代理
//	//, proxyMode = ScopedProxyMode.TARGET_CLASS
//	@Scope(value = "prototype")
//	public Store stringStore() {
//		return new StringStore();
//	}
	
	
	
//	//若@Bean指定了名称，则bean的id就是这里指定的名称，这里的init和destroy在StringStore里进行定义
//	@Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
//	//若@Bean没有指定名称，则bean的id就是这里的方法名
//	//@Bean
//	public Store stringStore(){
//		return new StringStore();
//	}
	
	@Autowired
	private Store<String> s1;
	
	@Autowired
	private Store<Integer> s2;
	
	@Bean
	public StringStore stringStore() {
		return new StringStore();
	}
	
	@Bean
	public IntegerStore integerStore() {
		return new IntegerStore();
	}
	
//	@Bean(name = "stringStoreTest")
//	//这里返回类型不能与上面的返回类型一致，也就是返回类型Store不能更改为StringStore
	//因为若更改为StringStore，在@Autowired执行自动装配的时候，会发现有两个类型都是StringStore，则会导致自动装配失败
//	public Store stringStoreTest() {
//		System.out.println("s1: " + s1.getClass().getName());
//		System.out.println("s2: " + s2.getClass().getName());
//		return new StringStore();
//	}
}
