package com.imooc.beanannotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.beanannotation.injection.dao.InjectionDao;

@Service
public class InjectionServiceImpl implements InjectionService{

	@Autowired
	private InjectionDao injectionDao;
	
//	@Autowired
//	public InjectionServiceImpl(InjectionDao injectionDao) {
//		this.injectionDao = injectionDao;
//	}
	
//	@Autowired
//	public void setInjectionDao(InjectionDao injectionDao) {
//		this.injectionDao = injectionDao;
//	}

	@Override
	public void save(String word) {
		System.out.println("service parameters:" + word);
		word = word + ":" + this.hashCode();
		injectionDao.save(word);
	}

}
