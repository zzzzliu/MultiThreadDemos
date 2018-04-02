package theLockAndReentrantLock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList();
		Lock lock = new ReentrantLock();
		int amount = 10;
		Thread[] threads = new Thread[amount];
		for (int i = 0; i < amount; i++) {
			threads[i] = new Thread(new MyThread(list, lock), "Thread" + i);
			threads[i].start();
		}
		for (Thread th: threads)
			th.join();
		System.out.println("\n" + "The final state of the List:             "+ Arrays.toString(list.toArray()));
	}
}
