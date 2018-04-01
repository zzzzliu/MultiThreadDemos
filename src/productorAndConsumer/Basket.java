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
					System.out.println("告诉" + Thread.currentThread().getName() + "线程，已经满了！！！！！！！！！！！！，进入wait()");
					basket.wait();
					System.out.println(Thread.currentThread().getName() + "线程在add()中的wait()后");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			basket.add(bread);
			System.out.println("生产了" + bread + "，还有" + basket.size() + "个馒头");
			basket.notifyAll();
		}
	}
	
	public Bread poll() {
		synchronized (basket) {
			while (basket.size() <= 0) {
				try {
					System.out.println("告诉" + Thread.currentThread().getName() + "线程，已经没了！！！！！！！！！！！！，进入wait()");
					basket.wait();
					System.out.println(Thread.currentThread().getName() + "线程在poll()中的wait()后");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Bread bread = basket.poll();
			System.out.println("消费了" + bread + "，还有" + basket.size() + "个馒头");
			basket.notifyAll();
			return bread;
		}
	}
	public int size() {
		return basket.size();
	}
}
