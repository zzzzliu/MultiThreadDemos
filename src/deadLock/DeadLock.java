package deadLock;

class DeadLockThread implements Runnable {  
    public int flag;  
    private static Object o1 = new Object(), o2 = new Object();  
    public DeadLockThread(int flag) {
    		this.flag = flag;
    }
    @Override 
    public void run() {  
        System.out.println(Thread.currentThread().getName() + " start running");  
        if (flag == 1) {  
            synchronized (o1) {  
                try {  
                    Thread.sleep(500);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }
                System.out.println(Thread.currentThread().getName() + " Already got o1, Trying to get the lock of o2");
                synchronized (o2) {  
                    System.out.println("Get o2");  
                }  
                System.out.println(Thread.currentThread().getName() + " has got the lock of o2");
            }  
        }  
        if (flag == 0) {  
            synchronized (o2) {  
                try {  
                    Thread.sleep(500);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }
                System.out.println(Thread.currentThread().getName() + " Already got o2, Trying to get the lock of o1");
                synchronized (o1) {  
                    System.out.println("0");  
                }  
                System.out.println(Thread.currentThread().getName() + " has got the lock of o1");
            }  
        }  
    }  
}
public class DeadLock{
    public static void main(String[] args) {  
        new Thread(new DeadLockThread(1)).start();  
        new Thread(new DeadLockThread(0)).start();  
    }  
}