package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddThreads {

	static AtomicInteger counter = new AtomicInteger(1);
	
	static final int MAX_LIMIT = 100;

	public static void main(String[] args) {

		
		EvenOddThreads obj = new EvenOddThreads();
		
		Thread t1 = new Thread("t1") {
			public void run() {

				try {
					obj.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t2 = new Thread("t2") {
			public void run() {

				try {
					obj.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();

	}

	public synchronized void printOdd() throws InterruptedException {
		while (counter.get() <= MAX_LIMIT) {

			if (counter.get() % 2 == 1) {
				System.out.println("Running by Thread- " + Thread.currentThread().getName() + " Odd number: "
						+ counter.get());
				counter.getAndIncrement();
				wait();
				notifyAll();
			}
		}
	}

	public synchronized void printEven() throws InterruptedException {
		while (counter.get() <= MAX_LIMIT) {

			if (counter.get() % 2 == 0) {
				System.out.println("Running by Thread- " + Thread.currentThread().getName() + " Even number: "
						+ counter.get());
				counter.getAndIncrement();
				notifyAll();
				wait();
			}
		}
	}

}
