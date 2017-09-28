package com.imooc.bean;

public class BeanScope {
	public void say() {
		System.out.println("BeanScope say:" + this.hashCode());//hashCode可以区分是否是同一个实例。
	}
}
