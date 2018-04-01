package productorAndConsumer;
import java.util.*;
public class Consumer implements Runnable {
	Basket basket;
	int mission;
	public Consumer (Basket basket, int mission) {
		this.basket = basket;
		this.mission = mission;
	}
	public void run() {
		for (int i = 1; i <= mission; i++) {
			Bread b = basket.poll();
		}
	}
}
