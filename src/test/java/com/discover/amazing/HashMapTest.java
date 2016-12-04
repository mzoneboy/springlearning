
package com.discover.amazing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
/** 
 * <Description> <br> 
 *  
 * @author<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月18日 <br>
 */
public class HashMapTest {
	
    public static void main(String[] args) { 
        Map<Thread, String> weakHashMap = new WeakHashMap<Thread, String>();
        
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        weakHashMap.put(thread1, "thread1");
        weakHashMap.put(thread2, "thread2");
        thread1 = null;
        System.gc();
        
        for(Entry<Thread, String> entry:weakHashMap.entrySet()){
        	//System.out.println(entry.getValue());
        	entry.setValue(null);
        }
        
        Map<Thread, String> hashMap = new HashMap<Thread, String>();
        
        Thread thread3 = new Thread();
        Thread thread4 = new Thread();
        hashMap.put(thread3, "thread3");
        hashMap.put(thread4, "thread4");
        thread3 = null;
        System.gc();
        
        for(Entry<Thread, String> entry:hashMap.entrySet()){
        	System.out.println(entry.getValue());
        }
        
        for(Entry<Thread, String> entry:weakHashMap.entrySet()){
        	System.out.println(entry.getValue());
        }
    }
	
}
