package deadLock;

public class DeadLockTest {
	public static void main(String[] args) throws InterruptedException {
		// Create 3 accounts
		Account Tom = new Account(123, "Tom", 3000);
		Account Jerry = new Account(37, "Jerry", 3000);
		Account Cory = new Account(5, "Cory", 3000);
		System.out.println("Tom has money: " + Tom.getAmount());
		System.out.println("Jerry has money: " + Jerry.getAmount());
		System.out.println("Cory has money: " + Cory.getAmount() + "\n");
		
		// Create 3 actions, which will generate a loop
		Runnable tomToJerry = new DeadLockTransfer(500, Tom, Jerry);
		Runnable jerryToCory = new DeadLockTransfer(400, Jerry, Cory);
		Runnable coryToTom = new DeadLockTransfer(300, Cory, Tom);
		
		// Run 3 actions
		Thread t1 = new Thread(tomToJerry, "TOMTOJERRY");
		Thread t2 = new Thread(jerryToCory, "JERRYTOCORY");
		Thread t3 = new Thread(coryToTom, "CORYTOTOM");
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		
		// Print final state
		System.out.println("\nTom has money: " + Tom.getAmount());
		System.out.println("Jerry has money: " + Jerry.getAmount());
		System.out.println("Cory has money: " + Cory.getAmount());
	}
}
