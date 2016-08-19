package com.discover.amazing.proxy;

public class CustProxy implements ICust {
	
	private ICust cust;

	public CustProxy(ICust cust) {
		this.cust = cust;
	}

	public String recharge(Long subsId, double money) {
	    try {
            verifyMoney(money);
        }
        catch (Exception e) {
            return "failed";
        }
	    
		this.cust.recharge(subsId, money);
		
		verifyRecharge(subsId);
		
		return "success";
	}
	
	private void verifyMoney(double money) throws Exception {
        if(money <= 0) {
            throw new Exception("before recharge, The recharge money " + money + " is invalid...");
        } else {
            System.out.println("before recharge, The recharge money " + money + " is valid...");
        }
    }
	
	private void verifyRecharge(Long subsId) {
        System.out.println("after recharge, find subsId "+subsId+" to verify the money from database...");
    }

}
