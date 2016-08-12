package com.discover.amazing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({"/META-INF/spring/amazing-base-auto.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AopTest {
    @Autowired  
    NormalCust cust;  
      
    @Test  
    public void testAutoScan() {  
        cust.recharge(101L, 300);  
    }  
}
