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
	
//	//@Value���ֵӦ����properties���key���Ӧ
//	@Value("${url}")
//	private String url;
//	
//	//username��ȡ��ǰ��¼�ı����ԵĲ���ϵͳ������
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
//	//ָ��bean�ķ�Χ�ʹ���
//	//, proxyMode = ScopedProxyMode.TARGET_CLASS
//	@Scope(value = "prototype")
//	public Store stringStore() {
//		return new StringStore();
//	}
	
	
	
//	//��@Beanָ�������ƣ���bean��id��������ָ�������ƣ������init��destroy��StringStore����ж���
//	@Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
//	//��@Beanû��ָ�����ƣ���bean��id��������ķ�����
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
//	//���ﷵ�����Ͳ���������ķ�������һ�£�Ҳ���Ƿ�������Store���ܸ���ΪStringStore
	//��Ϊ������ΪStringStore����@Autowiredִ���Զ�װ���ʱ�򣬻ᷢ�����������Ͷ���StringStore����ᵼ���Զ�װ��ʧ��
//	public Store stringStoreTest() {
//		System.out.println("s1: " + s1.getClass().getName());
//		System.out.println("s2: " + s2.getClass().getName());
//		return new StringStore();
//	}
}
