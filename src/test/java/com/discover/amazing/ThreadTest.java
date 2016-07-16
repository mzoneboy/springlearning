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
	public void testThread() {
		
		//incThread.run();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		/*ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));*/
		for(int i =0;i<6;i++){
			IncTask incThread = new IncTask();
			executor.execute(incThread);
		}
		
		executor.shutdown();
	}
}
