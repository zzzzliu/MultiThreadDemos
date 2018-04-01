package theAtomicClass;
import java.util.concurrent.*;

class intWrapper {
	private static volatile int count = 0;
	public static void plus() {
		count++;
	}
	public static synchronized void increment() {
		count++;
	}
	public static int getter() {
		return count;
	}
}

public class nonAtomicTest {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 0; i < 1000; i++) {
			pool.execute(new Runnable() {
				public void run() {
					intWrapper.plus();
//					intWrapper.increment();
				}
			});
		}
		pool.shutdown();
		System.out.println(intWrapper.getter());
	}
}
