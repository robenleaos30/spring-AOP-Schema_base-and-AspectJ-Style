package com.jdc.demo.utils;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class DemoAdviser implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("----------------------------------");
		System.out.printf("Target Class  : %s%n".formatted(target.getClass().getSimpleName()));
		System.out.printf("Target Method : %s%n".formatted(method.getName()));
		System.out.println("----------------------------------");
	}

}
