package deadLock;

public class Account {
	private int id;
	private String name;
	private int amount;
	public Account (int id, String name, int amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	public int getAmount() {
		return this.amount;
	}
	public int getId() {
		return this.id;
	}
	public void transfer(int money) {
		this.amount -= money;
	}
	public String getName() {
		return this.name;
	}
}
