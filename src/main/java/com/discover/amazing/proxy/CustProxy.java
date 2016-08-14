package com.discover.amazing.proxy;

public class CustProxy implements ICust {
	
	private ICust cust;

	public CustProxy(ICust cust) {
		this.cust = cust;
	}

	public String recharge(Long subsId, double money) {
		return this.cust.recharge(subsId, money);
	}

}
