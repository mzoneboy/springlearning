package com.discover.amazing;


import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component("Verifier")
public class Verifier {
	public Verifier() {
		// TODO Auto-generated constructor stub
	}
	
	public void verifyMoney(JoinPoint joinPoint) throws Exception {
	    Object args[] = joinPoint.getArgs();
	    Long money = Long.parseLong(args[1].toString());
		if(money <= 0) {
		    
			throw new Exception("before recharge, The recharge money " + money + " is invalid...");
		} else {
			System.out.println("before recharge, The recharge money " + money + " is valid...");
		}
	}
	
	public void verifyRecharge(double money) {
        System.out.println("after recharge, verify the money from database...");
    }
}
