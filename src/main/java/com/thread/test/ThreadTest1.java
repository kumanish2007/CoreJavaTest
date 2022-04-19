package com.thread.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadTest1 {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
	ScheduledFuture<Integer> task = (ScheduledFuture<Integer>) executorService.schedule(
	() -> {
		while (true) {
			System.out.println("inside scheduled thread");
			//Thread.sleep(1000);
			return 10;
		}
	}, 15, TimeUnit.SECONDS);
	
	//th.sleep(1000);
	System.out.println("Run after thread completed.");
	System.out.println("Tasks :"+ task.get());
	executorService.shutdown();
	System.out.println("Tasks after shutdown :"+ task.get());
	
}
}

class ThreadDemo extends Thread{
	public void run() {
		System.out.println("Thread details :"+ Thread.currentThread().getId() +""+Thread.currentThread().getName());
	}
}
