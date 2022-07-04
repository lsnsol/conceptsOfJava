
public class ThreadRunnable extends Thread implements Runnable{
	
	public void run()
	{
		System.out.println("some thread");
	}
	
public static void main(String args[])
{
	System.out.println("main thread");
	
	new ThreadRunnable().start();
	
	System.out.println(System.getProperty("java.version"));
}
}
