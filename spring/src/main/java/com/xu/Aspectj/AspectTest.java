package com.xu.Aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/*
* 切面类
* */
@Aspect
@Component
public class AspectTest {

	@Pointcut(value = "execution(public void com.xu.Aspectj.AopTestImpl.AopT(String))")
	public void Pointcut(){}

	@Before(value = "Pointcut()")
	public void A(JoinPoint joinPoint){
		System.out.println("Before AOP执行了===========");
	}

	@AfterReturning(value = "Pointcut()")
	public void B(JoinPoint joinPoint){
		System.out.println("afterRetuning AOP执行了===========");
	}

	@Around(value = "Pointcut()")
	public void Around(ProceedingJoinPoint pj){
		System.out.println("环绕通知=================");
		try {
			pj.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("环绕通知结束--------------------");

	}

}
