package com.imooc.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class MoocResource implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void resource() throws IOException {
		//���ֻ�ȡ��Դ�ķ�ʽ
	//	Resource resource = applicationContext.getResource("classpath:config.txt");
	//	Resource resource = applicationContext.getResource("file:D:\\workspace\\Spring\\cfg\\config.txt");
	//	Resource resource = applicationContext.getResource("url:http://www.qczk.cnki.net/QCHD/index.html");
		//���ǰ��ʲô��û�У���������ApplicationContextȥ���أ�Ҳ����classpath�ķ�ʽȥ����
		Resource resource = applicationContext.getResource("config.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
