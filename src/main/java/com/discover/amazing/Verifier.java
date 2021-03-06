package com.discover.amazing;


import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

/**
 * 
 * 基于xml方式配置的切面<br> 
 *  
 * @author yang.xiao<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年8月11日 <br>
 * @since V9.0<br>
 * @see com.discover.amazing <br>
 */
@Component("Verifier")
public class Verifier {
	public Verifier() {
		// TODO Auto-generated constructor stub
	}
	
	public void verifyMoney(JoinPoint joinPoint) throws Exception {
	    Object args[] = joinPoint.getArgs();
	    double money = Double.parseDouble(String.valueOf(args[1]));
		if(money <= 0) {
		    
			throw new Exception("before recharge, The recharge money " + money + " is invalid...");
		} else {
			System.out.println("before recharge, The recharge money " + money + " is valid...");
		}
	}
	
	public void verifyRecharge(JoinPoint joinPoint) {
	    Object args[] = joinPoint.getArgs();
	    Long subsId = Long.parseLong(String.valueOf(args[0]));
        System.out.println("after recharge, find subsId "+subsId+" to verify the money from database...");
    }
}
