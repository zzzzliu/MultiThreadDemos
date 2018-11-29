package countDownLatchDemo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class Sample {  
	private final static CountDownLatch mCountDownLatch = new CountDownLatch(100);  
    private static class WorkingThread implements Runnable {  
	    private final int mSleepTime;  
	    private int name;
	    public WorkingThread(int sleepTime, int name) {  
	        mSleepTime = sleepTime;  
	        this.name = name;
	    }  
	      
	    @Override  
	    public void run() {  
	    		String threadName = Thread.currentThread().getName();
	    		threadName += threadName.split("-")[3].length() < 2 ? " " : "";
	        System.out.println(threadName + " started, #" + name + " execution");  
	        try {    
	            Thread.sleep(mSleepTime);    
	        } catch (InterruptedException e) {    
	        		e.printStackTrace();    
	        }  
	        System.out.println(threadName +  " end");   
	        mCountDownLatch.countDown();  
	       }  
	    }  
	private static class SampleThread extends Thread {  
		@Override  
		public void run() {  
		    System.out.println("SampleThread started!");  
		    try {  
		    		// wait until the mCountDownLatch becomes 0
		    		mCountDownLatch.await();  
		    	} catch (InterruptedException e) {}  
	    		System.out.println("SampleThread end!");  
	    }  
	}  
    
    public static void main(String[] args) throws Exception {  
        new SampleThread().start(); 
        ExecutorService pool = Executors.newCachedThreadPool();
        
        for (int i = 1; i <= 100; i++) {
        		Runnable temp = new WorkingThread((int) Math.random() % 1000, i);
        		pool.execute(temp);
        }
        pool.shutdown();
    }  
} 