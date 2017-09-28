package com.imooc.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//scopeƒ¨»œ «singleton
@Scope("prototype")
//@Component("bean")
@Component
public class BeanAnnotation {
	
	public void say(String word) {
		System.out.println("BeanAnnotation:" + word);
	}
	
	public void myHashCode() {
		System.out.println("BeanAnnotation:" + this.hashCode());
	}
}
