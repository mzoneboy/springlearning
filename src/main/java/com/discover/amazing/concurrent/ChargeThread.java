package com.discover.amazing.concurrent;

import com.discover.amazing.inf.Cust;

public class ChargeThread implements Runnable {
    
    private Cust cust;
    
    public ChargeThread(Cust cust) {
        this.cust = cust;
    }

    public void run() {
        cust.recharge();
    }

}
