package com.xu.Aspectj;

import org.springframework.stereotype.Component;

/*
* 目标类
* */
@Component
public class AopTestImpl implements AopTest {

	@Override
	public void AopT(String str) {
		System.out.println("程序执行了.....");
	}

}
