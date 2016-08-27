package com.discover.amazing.aop;

import org.aspectj.lang.JoinPoint;


public interface IVerifier {
	public void verifyMoney(JoinPoint joinPoint) throws Exception;
	
	public void verifyRecharge(JoinPoint joinPoint);
}
