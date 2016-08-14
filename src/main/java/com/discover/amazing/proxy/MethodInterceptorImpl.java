package com.discover.amazing.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MethodInterceptorImpl implements MethodInterceptor {
	private Object obj;
	
	private String name; 

	public MethodInterceptorImpl(String name) {
		this.name = name;
	}
	
	public Object newProxyInstance(Object obj) {
	    this.obj = obj;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.obj.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		return proxy.invoke(obj, args);
	}

}
