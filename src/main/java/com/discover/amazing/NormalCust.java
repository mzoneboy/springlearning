package com.discover.amazing;

import org.springframework.stereotype.Component;

import com.discover.amazing.inf.Cust;

@Component
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
	
	// 通过构造方法注入
	/*public NormalCust (double money) {
		this.money = money;
	}*/
	
	public void recharge() {
		System.out.println("Cust recharges " + this.money);
	}

}
