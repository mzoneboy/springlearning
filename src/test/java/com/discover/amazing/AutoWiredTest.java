/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.discover.amazing.dao.ISubsDAO;
import com.discover.amazing.dao.impl.SubsDAO;

import org.junit.Test;
import org.junit.runner.RunWith;
/** 
 * <Description> <br> 
 *  
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月18日 <br>
 * @since V7.3<br>
 * @see cn.javass.spring.chapter2 <br>
 */
@ContextConfiguration({"/META-INF/spring/amazing-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AutoWiredTest {
    @Autowired
    Subs subs;
    
    /**
     * 
     * 测试@Autowired的使用 <br> 
     *  
     * @author yang.xiao(0027008536)<br>
     * @taskId <br> <br>
     */
    //@Test
    public void testAutoWired() {
        subs.changePsw();
    }
    
    /**
     * 
     * 使用AOP除了spring自己的aop jar包外，还需要aopalliance.jar， aspectjweaver.jar<br> 
     *  
     * @author yang.xiao(0027008536)<br>
     * @taskId <br> <br>
     */
    @Test
    public void testAOP() {
        subs.createSub();
    }
}
