package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableVsCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<Integer> futureCallable = es.submit(new CallableClass());
		Future futureRunnable = es.submit(new RunnableClass());
		
		System.out.println("callable return value::"+futureCallable.get().intValue());

	}
}

class RunnableClass implements Runnable {

	@Override
	public void run() {
		System.out.println("In Run method");
	}
	
}

class CallableClass implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println("In Call method");
		return 1+2;
	}
	
}