package productorAndConsumer;
import java.util.*;
public class Main {
	static public void main(String args[]) throws InterruptedException {
		Basket basket = new Basket();
		int mission = 100;
		Runnable productor = new Productor(basket, mission);
		Runnable consumer = new Consumer(basket, mission);
		Thread t1 = new Thread(productor, "Producer");
		Thread t2 = new Thread(consumer, "Consumer");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("\nEnd of the demo");
	}
}
