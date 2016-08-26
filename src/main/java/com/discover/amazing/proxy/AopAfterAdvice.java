package com.discover.amazing.proxy;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AopAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String methodName = method.getName();  //得到方法名   
        String targetClassName = target.getClass().getName();//得到调用类名  
        System.out.println(targetClassName+"."+methodName+"()");  
        System.out.println("after excute target object...");  
        
    }

}
