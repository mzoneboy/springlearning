package com.discover.amazing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.discover.amazing.concurrent.ChargeThread;
import com.discover.amazing.inf.Cust;
import com.discover.amazing.util.RechargeUtil;

@ContextConfiguration({"/META-INF/spring/amazing-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringInjectionTest {
   @Autowired
   private Cust normalCust;
   
   @Test
   public void testFieldInjection() {
       System.out.println("testFieldInjection begin");
       normalCust.recharge();
       System.out.println("testFieldInjection end");
   }
   
   @Test
   public void testConstructorInjection() {
       System.out.println("testConstructorInjection begin");
       ChargeThread thread = new ChargeThread(normalCust);
       thread.run();
       System.out.println("testConstructorInjection end");
   }
   
   @Test
   public void testSetterInjection() {
       System.out.println("testSetterInjection begin");
       String result = RechargeUtil.InstantRecharge();
       System.out.println("testSetterInjection end, " + result);
   }

}
