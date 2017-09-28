package com.imooc.autowiring;

public class AutoWiringService {

	private AutoWiringDao autoWiringDao;
	
	public AutoWiringService(AutoWiringDao autoWiringDao) {
		System.out.println("AutoWiringService:");
		this.autoWiringDao = autoWiringDao;
	}

	public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
		this.autoWiringDao = autoWiringDao;
	}
	
	public void say(String word) {
		System.out.println("setAutoWiringDao...");
		this.autoWiringDao.say(word);
	}
}
