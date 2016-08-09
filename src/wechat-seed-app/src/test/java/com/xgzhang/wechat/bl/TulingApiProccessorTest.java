package com.xgzhang.wechat.bl;

import org.junit.Test;

import processor.TulingApiProcess;

public class TulingApiProccessorTest {
	
	@Test
	public void processText(){
		TulingApiProcess processor = new TulingApiProcess();
		String result = processor.getTulingResult("你似不似傻");
		System.out.println(result);
	}
}
