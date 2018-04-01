package threadAndRunnable;

public class myThread extends Thread {
    private String name;  
    public myThread (String name) {  
       this.name=name;  
    }  
    public void run() {  
    		System.out.println(name + "正在执行");
    }  
}
