package com.discover.amazing;

import org.springframework.stereotype.Component;

@Component("Verifier")
public class Verifier {
	public Verifier() {
		// TODO Auto-generated constructor stub
	}
	
	public void verifyMoney(double money) {
		if(money <= 0) {
			System.out.println("The recharge money " + money + " is invalid...");
		} else {
			System.out.println("The recharge money " + money + " is valid...");
		}
	}
}
