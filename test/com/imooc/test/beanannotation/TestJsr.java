package com.imooc.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.beanannotation.jsr.JsrService;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase {

	public TestJsr() {
		super("classpath:spring-beanannotation.xml");
	}
	
	@Test
	public void testSave() {
		JsrService service = super.getBean("jsrService");
		service.save();
	}

}
