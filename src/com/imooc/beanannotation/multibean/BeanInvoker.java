package com.imooc.beanannotation.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {
	
	//可以利用@Autowired注解，将两个实现类的实例同时注入list或map中
	//list中会被注解进来bean的实例，只有bean的对象
	@Autowired
	private List<BeanInterface> list;
	
	//map中会被注解进来bean的id和实例，bean的id就是class的类名第一个字母小写
	@Autowired
	private Map<String, BeanInterface> map;
	
	//将@Qualifier与@Autowired一起用，可以指定注入的某一个实现类的实例
	@Autowired
	@Qualifier("beanImplOne")
	private BeanInterface beanInterface;
	
	public void say() {
		if(null != list && 0 != list.size()) {
			System.out.println("list...");
			for(BeanInterface bean:list) {
				System.out.println(bean.getClass().getName());
			}
		}
		else {
			System.out.println("List<BeanInterface> list is null....");
		}
		
		System.out.println();
		
		if(null != map && 0 != map.size()) { 
			System.out.println("map...");
			for(Map.Entry<String, BeanInterface> entry:map.entrySet()) {
				System.out.println(entry.getKey() + "......" + entry.getValue().getClass().getName());
			}
		}
		else {
			System.out.println("Map<String, BeanInterface> map is null...");
		}
		
		System.out.println();
		
		if(null != beanInterface){
			System.out.println(beanInterface.getClass().getName());
		}
		else {
			System.out.println("beanInterface is null...");
		}
	}
}