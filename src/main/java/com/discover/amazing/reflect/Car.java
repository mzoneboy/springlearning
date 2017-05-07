package com.discover.amazing.reflect;

public class Car {
	private String name;
	
	private Long price;
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
	public Car(String name, Long price) {
		this.name = name;
		this.price = price;
	}

	public boolean isExpensive() {
        if(this.getPrice()>200000L){
        	System.out.println("this car price is more than 20w!");
            return true;
        } else {
        	System.out.println("this car price is less than 20w!");
            return false;
        }
    }
}
