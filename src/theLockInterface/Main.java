package theLockInterface;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.*;

class myThread implements Runnable {
	private List<String> list;
	private Lock lock;
	public myThread(List<String> list, Lock lock) {
		this.list = list;
		this.lock = lock;
	}
	public void run() {
		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " get the lock of List:        " + Arrays.toString(list.toArray()));
			try {
				list.add(Thread.currentThread().getName());
			} finally {
				System.out.println(Thread.currentThread().getName() + " release the lock of List:    " + Arrays.toString(list.toArray()));
				lock.unlock();
			}
		} else {
			System.out.println(Thread.currentThread().getName() + " cannot get the lock of List: " + Arrays.toString(list.toArray()));
		}
	}
	
}

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		Lock lock = new ReentrantLock();
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			Runnable temp = new myThread(list, lock);
			new Thread(temp, "Thread" + i).start();
		}
		pool.shutdown();
		System.out.println("\n" + "The final state of the List: "+ Arrays.toString(list.toArray()));
	}
}
