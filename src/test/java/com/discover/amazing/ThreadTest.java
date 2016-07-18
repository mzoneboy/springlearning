package com.discover.amazing;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.discover.amazing.concurrent.IncTask;


@ContextConfiguration({"/META-INF/spring/amazing-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ThreadTest {
	@Test
	public void testThread() throws InterruptedException {
	    IncTask incThread = new IncTask();
		//incThread.run();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		/*ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(3));*/
		for(int i =0;i<6;i++){
			//incThread.run();
			executor.execute(incThread);
		}
		
		//executor.shutdown();
		Thread.sleep(5000);
	}
}
