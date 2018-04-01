package deadLock;

public class DeadLockTransfer implements Runnable {
	// This mechanism will cause deadlock since two threads can obtain the lock of inAccount and outAccount
	// respectively, then neither threads can obtain the other lock
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