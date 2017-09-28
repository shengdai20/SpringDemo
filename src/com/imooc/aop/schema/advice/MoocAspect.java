package com.imooc.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {

	public void before() {
		System.out.println("MoocAspect before...");
	}
	
	public void afterReturning() {
		System.out.println("MoocAspect afterReturning...");
	}
	
	public void afterThrowing() {
		System.out.println("MoocAspect afterThrowing...");
	}
	
	public void after() {
		System.out.println("MoocAspect after...");
	}
	
	public Object around(ProceedingJoinPoint proceedingJoinPoint) {
		Object obj = null;
		try {
			System.out.println("MoocAspect around1...");
			obj = proceedingJoinPoint.proceed();
			System.out.println("MoocAspect around2...");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	
	public Object aroundInit(ProceedingJoinPoint proceedingJoinPoint, String bizName, int times) {
		System.out.println(bizName + "------" + times);
		Object obj = null;
		try {
			System.out.println("MoocAspect aroundInit1...");
			obj = proceedingJoinPoint.proceed();
			System.out.println("MoocAspect aroundInit2...");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return obj;
	}
}
