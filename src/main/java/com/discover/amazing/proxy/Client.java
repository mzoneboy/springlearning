package com.discover.amazing.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.MethodInterceptor;

public class Client {

	public static void main(String[] args) {
		ICust realCust = new Cust("Michael");
		
		// 代理开始工作
		ICust proxyCust = new CustProxy(realCust);
		
		// JDK动态代理
		/*InvocationHandler myInvocationHandler = new InvocationHandlerImpl(realCust);
		ClassLoader classLoader = realCust.getClass().getClassLoader();
		//new Class[] {ICust.class}
		ICust proxyCust = (ICust)Proxy.newProxyInstance(classLoader, realCust.getClass().getInterfaces(), myInvocationHandler);*/
		
		// Cglib动态代理
		/*MethodInterceptorImpl methodInterceptor = new MethodInterceptorImpl("Michael");
		Cust proxyCust = (Cust)methodInterceptor.newProxyInstance(new Cust());*/
		
		proxyCust.recharge(13067895521L, 100);
	}

}
