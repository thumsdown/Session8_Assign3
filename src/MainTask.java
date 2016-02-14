
public class MainTask {
public static void main(String[] args) {
	Thread1 th1 = new Thread1();
	Thread2 th2 = new Thread2();
	Thread th2Obj = new Thread(th2);
	Thread3 th3 = new Thread3();
	
	th1.setName("Thread 1");
	th1.setPriority(Thread.MAX_PRIORITY);
	
	th2Obj.setName("Thread 2");
	th2Obj.setPriority(Thread.NORM_PRIORITY);
	
	th3.setName("Thread 3");
	th3.setPriority(Thread.MIN_PRIORITY);
	
	th1.start();
	th2Obj.start();
	th3.start();
	
}
}
