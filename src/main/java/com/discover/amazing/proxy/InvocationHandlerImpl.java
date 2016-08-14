package com.discover.amazing.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {
	
	Object obj = null;
	public InvocationHandlerImpl(Object obj) {
		this.obj = obj;
	}

	/**
	 * method:代理执行的被代理者的方法
	 * args:方法的所有参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		// 需要通知时放开
		/*if(result.equals("success")){
			IAdvice afterAdvice = new AfterAdvice();
			afterAdvice.exec();
		}*/
		
		return result;
	}

}
