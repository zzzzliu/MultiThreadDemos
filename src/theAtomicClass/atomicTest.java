package theAtomicClass;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
class atomicIntWrapper {
	private static AtomicInteger count = new AtomicInteger(0);
	public static void plus() {
		count.getAndIncrement();
	}
	public static int getter() {
		return count.get();
	}
}


public class atomicTest {
	public static void main(String[] args) {

		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 0; i < 1000; i++) {
			pool.execute(new Runnable() {
				public void run() {
					atomicIntWrapper.plus();
				}
			});
		}
		pool.shutdown();
		System.out.println(atomicIntWrapper.getter());
	}
}
