
package com.discover.amazing;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.junit.runner.RunWith;
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
public class HashMapTest {
	@Test
    public void testEntrySet() {
    	Map<Integer, Object> testMap = new HashMap<Integer, Object>();
    	//1000W 92s
        for(int i=0; i<10000; i++){
        	testMap.put(i, new Object());
        }
        
        Date beginDate = new Date();
        for(Entry<Integer, Object> entrySet:testMap.entrySet()){
        	
        }
        
        Date endDate = new Date();
        
        long timeSpan = endDate.getTime()-beginDate.getTime();
        
        System.out.println("testEntrySet____timeSpan is " + timeSpan);
    }

}
