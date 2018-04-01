package productorAndConsumer;
import java.util.*;
public class Main {
	static public void main(String args[]) {
		Basket basket = new Basket();
		int mission = 100;
		Runnable productor = new Productor(basket, mission);
		Runnable consumer = new Consumer(basket, mission);
		new Thread(productor, "生产者").start();
		new Thread(consumer, "消费者").start();
	}
}
