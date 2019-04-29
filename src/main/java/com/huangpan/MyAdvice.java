package com.huangpan;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice   {
	
	public void mybefor(JoinPoint jp) {
		System.out.println("前...");
	}
	
	public void myafer(JoinPoint jp) {
		System.out.println("后...");
	}
	
	public Object  myaround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("前");
		//手动执行目标方法
		Object obj = joinPoint.proceed();
		System.out.println("后");
		return obj;	
	}
}
