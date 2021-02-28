package assignment.ProducerConsumerPattern;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 
 * @author andrewwerling
 * 
 * After watching a tutorial from Cave of Programming I found this method to fulfill
 * the assignment requirements with less code than I was planning to use.
 * video found here: https://www.youtube.com/watch?v=Vrt5LqpH2D0&feature=emb_title
 * 
 *
 *
 */
public class ProducerConsumerPattern {

	// Array Blocking Queue Interface removes need to synchronize between threads
	// max size of 1000 in thread safe queue
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(50);
	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Thread threadOne = new Thread(new Runnable() {
			public void run() {
				try {
					producerMethod();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});

		Thread threadTwo = new Thread(new Runnable() {
			public void run() {
				try {
					consumerMethod();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});

		threadOne.start();
		threadTwo.start();

		
		threadOne.join();
		threadTwo.join();
		

	}
	/**
	 * 
	 * @throws InterruptedException
	 * 
	 * Indefinitely loops and adds randInteger integers to queue as quickly as possible
	 */
	private static void producerMethod() throws InterruptedException {

		Random randInteger = new Random();

		while (true) {
			queue.put(randInteger.nextInt(50));
		}
	}
	/**
	 * 
	 * @throws InterruptedException
	 * 
	 * Indefinitely loops and takes randInteger integers from queue waiting 100 milliseconds each loop iteration
	 */
	private static void consumerMethod() throws InterruptedException {

		Random randInteger = new Random();

		while (true) {

			Thread.sleep(10);
			if (randInteger.nextInt(50) == 0) {
				Integer takeValue = queue.take();

				System.out.println("Integer Value removed = " + takeValue + "\nBlocking Queue size   = " + queue.size() + "\n");

			}
		}
	}
}