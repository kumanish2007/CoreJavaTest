package com.thread.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorTest1 {
public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
	
	//Executor service
	ExecutorService executorService = Executors.newFixedThreadPool(5);
	
	executorService.submit(() -> System.out.println("I am in runnable service"));
	System.out.println("After executor service completed");
	
	Future<Integer> future = executorService.submit(() -> {
		System.out.println("I am in callable");
		return 10;
	});
	System.out.println(future.get(1, TimeUnit.SECONDS));
	
	ExecutorService executor = Executors.newCachedThreadPool();

    List<Callable<Integer>> listOfCallable = Arrays.asList(
            () -> 1,
            () -> 2,
            () -> 3);

    try {

        List<Future<Integer>> futures = executor.invokeAll(listOfCallable);

        int sum = futures.stream().map(f -> {
            try {
                return f.get();
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }).mapToInt(Integer::intValue).sum();

        System.out.println(sum);

    } catch (InterruptedException e) {// thread was interrupted
        e.printStackTrace();
    } finally {

        // shut down the executor manually
        executor.shutdown();

    }
}
}
