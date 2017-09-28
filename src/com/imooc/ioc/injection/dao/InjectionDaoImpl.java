package com.imooc.ioc.injection.dao;

public class InjectionDaoImpl implements InjectionDao{

	@Override
	public void save(String arg) {
		//模拟数据库保存操作
		System.out.println("save data:" + arg);
	}

}
