package com.discover.amazing.proxy;

public class Cust implements ICust {
	private String custName;
	
	public Cust(String custName) {
		this.custName = custName;
	}
	
	public Cust () {
		
	}

	public String recharge(Long subsId, double money) {
		System.out.println(custName + " recharge " + money + " for number " + subsId);
		return "success";
	}

}
