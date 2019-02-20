package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolDemo implements Runnable {

	public static int MAX_THREADS = 5;

	public static AtomicInteger counter = new AtomicInteger(1);

	String name;

	public ThreadPoolDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		while (counter.get() <= 100) {
			System.out.println("Running by Thread: " + Thread.currentThread().getName() + " : " + counter.getAndIncrement());
		}
	}

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(MAX_THREADS);
		for (int i = 0; i < MAX_THREADS; i++) {
			Runnable r = new ThreadPoolDemo("t" + i);
			es.execute(r);
		}
	}

}
