package theLockAndReentrantLock;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class MyThread implements Runnable {
	private List<String> list;
	private Lock lock;
	
	public MyThread(List<String> list, Lock lock) {
		this.list = list;
		this.lock = lock;
	}
	public void run() {
		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " get the lock of the List:        " + Arrays.toString(list.toArray()));
			try {
				list.add(Thread.currentThread().getName());
			} finally {
				System.out.println(Thread.currentThread().getName() + " release the lock of List:        " + Arrays.toString(list.toArray()));
				lock.unlock();
			}
		} else {
			System.out.println(Thread.currentThread().getName() + " cannot get the lock of the List: " + Arrays.toString(list.toArray()));
		}
	}
}