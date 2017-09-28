package com.imooc.ioc.injection.service;

import com.imooc.ioc.injection.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDao injectionDao;
	
	//构造注入
	public InjectionServiceImpl(InjectionDao injectionDao) {//该injectionDao参数不能改名字
		this.injectionDao = injectionDao;
	}
	
	@Override
	public void save(String arg) {
		//模拟业务操作
		System.out.println("service parameters:" + arg);
		arg = arg + ':' + this.hashCode();
		injectionDao.save(arg);
	}

	//设值注入，用set方法自动完成
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}

	
}
