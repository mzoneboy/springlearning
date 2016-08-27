package com.discover.amazing;

import org.springframework.stereotype.Component;

import com.discover.amazing.inf.Cust;

@Component("NormalCust")
public class NormalCust implements Cust {

	private double money;
	
	public double getMoney() {
		return money;
	}

	// 通过属性方式注入
	public void setMoney(double money) {
		this.money = money;
	}

	public NormalCust () {
		
	}
	
	private double[] fees;
	
	
	// 通过构造方法注入
	/*public NormalCust (double money) {
		this.money = money;
	}*/
	
	public void setFees(double[] fees) {
		this.fees = fees;
	}

	public void recharge() {
		for(int i=0; i<fees.length; i++)
		{
			this.money += fees[i];
		}
		System.out.println("Cust recharges " + this.money);
	}
	
	public void checkScan() {
		System.out.println("scan NormalCust.class and wire it into a bean...");
	}

	public void recharge(Long subsId, double money) {
		
		System.out.println("recharge begin...");
	}
	
    public void recharge1(Long subsId, double money) throws Exception {
		if(money<=0){
			throw new Exception("before recharge, The recharge money " + money + " is invalid...");
		} else {
			System.out.println("before recharge, The recharge money " + money + " is valid...");
		}
		
		// TODO:save money
		System.out.println("recharge begin...");
		
		// find money from database where subsId is subsId
		System.out.println("after recharge, find subsId "+subsId+" to verify the money from database...");
	}

}
