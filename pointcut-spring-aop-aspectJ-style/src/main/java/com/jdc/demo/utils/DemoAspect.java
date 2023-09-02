package com.jdc.demo.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class DemoAspect {

	@Before("CommonPointCuts.memberDaoClasses() && CommonPointCuts.searchMethod()")
	public void beforeLog(JoinPoint joinPoint) {
		System.out.println("Before Advice!");
		System.out.println("----------------------------------");
		System.out.printf("Target Class  : %s%n".formatted(joinPoint.getTarget().getClass().getSimpleName()));
		System.out.printf("Target Method : %s%n".formatted(joinPoint.getSignature().getName()));
		System.out.println("----------------------------------");
	}
}
