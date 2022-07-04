
class ThreadA extends Thread
{
	public void run(){
		for(int i=0;i<10;i++)
		{
			try{
			System.out.println("ThreadA:"+i);
			Thread.sleep(1000);
			}catch(Exception et)
			{
				System.out.println(et);
			}
		}
	}
}

class ThreadB extends Thread
{
	public void run(){
		System.out.println("run() in ThreadB");
		try{
		JoinBetweenChildThreads.ta.join();
		
		for(int i=20;i<30;i++)
		{
			System.out.println("ThreadB:"+i);
			Thread.sleep(1000);
		}	
		}catch(Exception et){ System.out.println(et); }
	}
}

public class JoinBetweenChildThreads {
	static ThreadA ta;
	static ThreadB tb;
	
	public static void main(String[] args) {
		ta = new ThreadA();
		tb = new ThreadB();
		
		ta.start();
		tb.start();
	}
}
