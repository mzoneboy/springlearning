package com.discover.amazing.concurrent;

public class DivTask implements Runnable {
    private int number, division;
    public DivTask(int number, int division) {
		this.number = number;
		this.division = division;
	}
	
	public void run() {
		System.out.println(number/division);
	}

}
