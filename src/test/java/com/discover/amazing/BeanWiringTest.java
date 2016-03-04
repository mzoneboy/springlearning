package com.discover.amazing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.discover.amazing.inf.Cust;

@ContextConfiguration({"/META-INF/spring/amazing-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BeanWiringTest {
	@Autowired
	NormalCust cust;
	@Test
	public void testCall() {
	/*	ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/amazing-base.xml");
		Cust cust =  (Cust) context.getBean("NormalCust");*/
		cust.recharge();
	}
}
