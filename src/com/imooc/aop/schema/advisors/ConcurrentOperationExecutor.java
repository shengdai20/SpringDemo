package com.imooc.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;

public class ConcurrentOperationExecutor implements Ordered{

	private static final int DEFAULT_MAX_RETRIES = 2;
	
	private int maxRetries = DEFAULT_MAX_RETRIES;
	
	private int order = 1;
	
	public void setMaxRetries(int maxRetries) {
		this.maxRetries = maxRetries;
	}
	
	public int getOrder() {
		return this.order;
	}
	
	public void setOrder(int order) {
		this.order = order;
	}
	
	public Object doConcurrentOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		//定义次数计数器
		int numAttempts = 0;
		PessimisticLockingFailureException lockFailureException;
		do {
			numAttempts++;
			//尝试的次数
			System.out.println("try times:" + numAttempts);
			try {
				//进行真正的尝试，执行方法的调用
				return proceedingJoinPoint.proceed();
			} catch (PessimisticLockingFailureException ex) {
				//如果方法执行过程中抛出指定类型的异常，会将其赋值给lockFailureException
				lockFailureException = ex;
			}
		} while(numAttempts <= this.maxRetries);
		System.out.println("try error:" + numAttempts);
		throw lockFailureException;
	}
}
