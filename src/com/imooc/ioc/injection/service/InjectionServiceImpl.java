package com.imooc.ioc.injection.service;

import com.imooc.ioc.injection.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDao injectionDao;
	
	//����ע��
	public InjectionServiceImpl(InjectionDao injectionDao) {//��injectionDao�������ܸ�����
		this.injectionDao = injectionDao;
	}
	
	@Override
	public void save(String arg) {
		//ģ��ҵ�����
		System.out.println("service parameters:" + arg);
		arg = arg + ':' + this.hashCode();
		injectionDao.save(arg);
	}

	//��ֵע�룬��set�����Զ����
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}

	
}
