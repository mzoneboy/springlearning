
package com.discover.amazing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/** 
 * <Description> <br> 
 *  
 * @author<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月18日 <br>
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
    @Test
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
