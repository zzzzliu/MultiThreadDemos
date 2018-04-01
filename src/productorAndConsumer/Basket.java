package productorAndConsumer;
import java.util.*;
public class Basket {
	static final private int size = 10;
	public Queue<Bread> basket;
	
	public Basket() {
		this.basket = new LinkedList();
	}
	public void add(Bread bread) {
		synchronized (basket) {
			while (basket.size() >= size) {
				try {
					System.out.println("Tell " + Thread.currentThread().getName() + " Thread, the basket is full, enter wait()!!!");
					basket.wait();
					System.out.println(Thread.currentThread().getName() + " Thread awakes from the wait() in add()");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			basket.add(bread);
			System.out.println("Produces " + bread + ", still have " + basket.size() + " breads");
			basket.notifyAll();
		}
	}
	
	public Bread poll() {
		synchronized (basket) {
			while (basket.size() <= 0) {
				try {
					System.out.println("Tell " + Thread.currentThread().getName() + " Thread, the basket is empty, enter wait()!!!");
					basket.wait();
					System.out.println(Thread.currentThread().getName() + " Thread awakes from the wait() in poll()");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Bread bread = basket.poll();
			System.out.println("Consumes " + bread + ", still have " + basket.size() + " breads");
			basket.notifyAll();
			return bread;
		}
	}
	public int size() {
		return basket.size();
	}
}
