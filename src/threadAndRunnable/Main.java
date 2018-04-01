package threadAndRunnable;
import java.util.concurrent.Executors;  
import java.util.concurrent.ExecutorService; 
public class Main {
    public static void main(String[] args) { 
    		System.out.println(Thread.currentThread().getName()+"主线程运行开始!"); 
    		ExecutorService pool = Executors.newSingleThreadExecutor();
    		Thread[] threads = new Thread[20];
    		for (int i = 0; i < 20; i++) {
    			threads[i] = new myThread("线程 " + i);  
    			pool.execute(threads[i]);
    		}
		// 关闭线程池  
		pool.shutdown();  
		System.out.println(Thread.currentThread().getName()+"主线程运行结束!"); 
    };
}
