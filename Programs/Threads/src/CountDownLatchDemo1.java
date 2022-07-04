import java.util.concurrent.CountDownLatch;
public class CountDownLatchDemo1
{ 
	static CountDownLatch latch = new CountDownLatch(4); 
	
	public static void main(String args[]) throws InterruptedException 
	{ 
		
		Worker1 first = new Worker1(1500, latch, "Child Thread 1"); 
		Worker1 second = new Worker1(2500, latch, "Child Thread 2"); 
		Worker1 third = new Worker1(3500, latch, "Child Thread 3"); 
		Worker1 fourth = new Worker1(4500, latch, "Child Thread 4"); 
		
		new MyThread5().start();
		
		first.start(); 
		second.start(); 
		third.start(); 
		fourth.start(); 
		
		// Main thread will wait until all thread finished 
		latch.await(); //comment this line to check use of latch
		System.out.println(Thread.currentThread().getName() + " has finished"); 
	} 
	
} 

class MyThread5 extends Thread{
	public void run()
	{
		try
		{
			System.out.println("MyThread5: before latch await");
			CountDownLatchDemo1.latch.await();
		}
		catch(Exception ie)
		{
			System.out.println("InterruptedException in MyThread5");
		}
		System.out.println("MyThread5:after latch await");
	}
}

class Worker1 extends Thread 
{ 
	private int delay; 
	private CountDownLatch latch; 
	public Worker1(int delay, CountDownLatch latch, String name) 
	{ 
		super(name); 
		this.delay = delay; 
		this.latch = latch; 
	} 
	
	@Override 
	public void run() 
	{ 
		try 
		{ 
			Thread.sleep(delay); 
			//perform some business activity here, like initializing a module,etc...
			
			latch.countDown(); 
			System.out.println(Thread.currentThread().getName() + " has finished"); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
}
