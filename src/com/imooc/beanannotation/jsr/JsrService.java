package com.imooc.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class JsrService {

	//不用set方法用@Resource也可以对dao进行实例化，类似于@Autowired
	@Resource
	private JsrDao jsrDao;
	
	@PostConstruct
	public void init() {
		System.out.println("jsrService init...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("jsrService destroy...");
	}
	
	public void save() {
		jsrDao.save();
	}
}
