package com.imooc.aop.api;

public class BizLogicImpl implements BizLogic {

	@Override
	public String save() {
		System.out.println("BizLogicImpl:Logic save...");
		return "LogicImpl save";
	}

}
