package com.discover.amazing.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.discover.amazing.inf.Cust;

@Component
public final class RechargeUtil {
    
    private RechargeUtil() {
        
    }
    
    private static Cust normalCust;
    
    @Autowired
    public void setNormalCust(Cust normalCust) {
        RechargeUtil.normalCust = normalCust;
    }

    public static String InstantRecharge() {
        normalCust.recharge();
        return "InstantRecharge Success!";
    }
}
