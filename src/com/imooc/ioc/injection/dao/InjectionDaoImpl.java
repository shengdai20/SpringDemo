package com.imooc.ioc.injection.dao;

public class InjectionDaoImpl implements InjectionDao{

	@Override
	public void save(String arg) {
		//ģ�����ݿⱣ�����
		System.out.println("save data:" + arg);
	}

}
