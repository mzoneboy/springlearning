package com.discover.amazing.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * 基于注解方式配置的切面<br> 
 *  
 * @author yang.xiao<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年8月11日 <br>
 * @since V9.0<br>
 * @see com.discover.amazing <br>
 */
@Aspect
@Component("VerifierAopAnnotation")
public class Verifier implements IVerifier {
	public Verifier() {
		// TODO Auto-generated constructor stub
	}
	
	@Pointcut("execution(* com.discover.amazing.inf.Cust.recharge(..))")
	public void pointCutMethod() {
        
    }
	
	@Before("pointCutMethod()")
	public void verifyMoney(JoinPoint joinPoint) throws Exception {
	    Object args[] = joinPoint.getArgs();
	    double money = Double.parseDouble(String.valueOf(args[1]));
		if(money <= 0) {
		    
			throw new Exception("before recharge, The recharge money " + money + " is invalid...");
		} else {
			System.out.println("before recharge, The recharge money " + money + " is valid...");
		}
	}
	
	@After("pointCutMethod()")
	public void verifyRecharge(JoinPoint joinPoint) {
	    Object args[] = joinPoint.getArgs();
	    Long subsId = Long.parseLong(String.valueOf(args[0]));
        System.out.println("after recharge, find subsId "+subsId+" to verify the money from database...");
    }
}
