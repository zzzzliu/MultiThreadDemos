package productorAndConsumer;
import java.util.*;
public class Productor implements Runnable {
	Basket basket;
	int mission;
	public Productor (Basket basket, int mission) {
		this.basket = basket;
		this.mission = mission;
	}
	public void run() {
		for (int i = 1; i <= mission; i++) {
			Bread b = new Bread("Bread #" + i);
			basket.add(b);
		}
	}
}
