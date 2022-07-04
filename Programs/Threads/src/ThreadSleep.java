
public class ThreadSleep {
public static void main(String args[]) throws InterruptedException
{
	for(int i=0;i<10;i++)
	{
		System.out.println("Hello:"+i);
		
		//Invoke Thread.sleep() to cause delay
		Thread.sleep(2000); //in milliseconds
	}
}
}
