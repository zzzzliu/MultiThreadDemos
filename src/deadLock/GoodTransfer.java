package deadLock;

public class GoodTransfer implements Runnable {
	// This mechanism won't cause deadlock because threads are required to obtain locks by the increasing
	// order of the accounts.
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
