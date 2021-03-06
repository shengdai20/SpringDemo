package com.imooc.aop.schema.advisors.service;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

@Service
public class InvokeService {
	
	//正常调用
	public void invoke() {
		System.out.println("InvokeService...");
	}
	
	//每次调用都会抛出异常
	public void invokeException() {
		throw new PessimisticLockingFailureException("");
	}
}
