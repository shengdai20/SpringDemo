package com.imooc.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDaoImpl implements InjectionDao{
	
	public void save(String word) {
		System.out.println("save datas:" + word);
	}
}
