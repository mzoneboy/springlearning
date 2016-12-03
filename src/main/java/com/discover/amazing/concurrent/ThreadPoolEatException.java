package com.discover.amazing.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEatException {

	public static void main(String[] args) {
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1, 10, 0, TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>());

		for(int i=0; i<3; i++) {
			// 无法打印堆栈信息
			Future future = threadPool.submit(new DivTask(99, i));
			try {
				future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 可以打印出堆栈信息
			threadPool.execute(new DivTask(99, i));
		}

	}

}
