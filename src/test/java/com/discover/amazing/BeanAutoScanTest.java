package com.discover.amazing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({"/META-INF/spring/amazing-base-auto.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BeanAutoScanTest {
	@Autowired
	NormalCust cust;
	
	@Test
	public void testAutoScan() {
		cust.checkScan();
		double[] fees = {100,30,50};
		cust.setFees(fees);
		cust.recharge();
		cust.recharge(-300);
	}
}
