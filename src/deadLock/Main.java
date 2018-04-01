package deadLock;
class Account {
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
class DeadLockTransfer implements Runnable {
	private int money;
	private Account in;
	private Account out;
	public DeadLockTransfer(int money, Account in, Account out) {
		this.money = money;
		this.in = in;
		this.out = out;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start");
		synchronized(in) {
			System.out.println(Thread.currentThread().getName() + " gets lock of in account(" + in.getName() + ")");
			synchronized(out) {
				System.out.println(Thread.currentThread().getName() + " gets lock of out account(" + out.getName() + ")");
				in.transfer(money);
				out.transfer(-money);
			}
		}
		System.out.println(Thread.currentThread().getName() + " finishs transfering");
	}
}

class GoodTransfer implements Runnable {
	private int money;
	private Account in;
	private Account out;
	public GoodTransfer(int money, Account in, Account out) {
		this.money = money;
		this.in = in;
		this.out = out;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start");
		if (in.getId() <= out.getId()) {
			synchronized(in) {
				System.out.println(Thread.currentThread().getName() + " gets lock of IN account(" + in.getName() + ")");
				synchronized(out) {
					System.out.println(Thread.currentThread().getName() + " gets lock of OUT account(" + out.getName() + ")");
					in.transfer(money);
					out.transfer(-money);
				}
			}
		} else {
			synchronized(out) {
				System.out.println(Thread.currentThread().getName() + " gets lock of OUT account(" + out.getName() + ")");
				synchronized(in) {
					System.out.println(Thread.currentThread().getName() + " gets lock of IN account(" + in.getName() + ")");
					in.transfer(money);
					out.transfer(-money);
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + " finishs transfering");
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Account Tom = new Account(123, "Tom", 3000);
		Account Jerry = new Account(37, "Jerry", 150);
		
//		Runnable tomToJerry = new DeadLockTransfer(10, Tom, Jerry);
//		Runnable jerryToTom = new DeadLockTransfer(100, Jerry, Tom);
		Runnable tomToJerry = new GoodTransfer(10, Tom, Jerry);
		Runnable jerryToTom = new GoodTransfer(100, Jerry, Tom);
		
		Thread t1 = new Thread(tomToJerry, "TOMTOJERRY");
		Thread t2 = new Thread(jerryToTom, "JERRYTOTOM");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Tom has money: " + Tom.getAmount());
		System.out.println("Jerry has money: " + Jerry.getAmount());
	}
}
