package assignment.ProducerConsumerPattern;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 
 * @author andrewwerling
 *
 */
public class ProducerConsumerPattern {

	// Array Blocking Queue Interface removes need to synchronize between threads
	// max size of 10 in thread safe queue
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		
		t1.join();
		t2.join();
		

	}
	/**
	 * 
	 * @throws InterruptedException
	 * 
	 * Indefinitely loops and adds random integers to queue as quickly as possible
	 */
	private static void producer() throws InterruptedException {

		Random random = new Random();

		while (true) {
			queue.put(random.nextInt(100));
		}
	}
	/**
	 * 
	 * @throws InterruptedException
	 * 
	 * Indefinitely loops and takes random integers from queue waiting 100 milliseconds each loop iteration
	 */
	private static void consumer() throws InterruptedException {

		Random random = new Random();

		while (true) {

			Thread.sleep(100);
			if (random.nextInt(10) == 0) {
				Integer value = queue.take();

				System.out.println("Taken value: " + value + "; Queue size is: " + queue.size());

			}
		}
	}
}