
class NewThread9 extends Thread{
	String name; //name of Thread
	
	NewThread9(String threadname){
		setName(threadname);
		System.out.println("New thread:"+threadname);
		start();
	}
	
	public void run(){
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name+":"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie){
			System.out.println(name+" Interrupted");
		}
		
		System.out.println(name+" Exiting");
	}
}


public class JoinCheckThread {
	public static void main(String args[])
	{
		NewThread9 nt1=new NewThread9("Alpha");
		NewThread9 nt2;
		NewThread9 nt3;
		NewThread9 nt4;
		//start the threads
		
		nt2=new NewThread9("Beta");
		nt3=new NewThread9("Teta");
		nt4=new NewThread9("Gama");
		
		//threads_status(nt1,nt2,nt3,nt4);
	try
	{
		nt1.join();
		nt2.join();
		nt3.join();
		nt4.join();
		
		
		System.out.println("completed all four threads");
	}catch(Exception ien)
	{
		System.out.println("main thread Interrupted");
	}
	threads_status(nt1,nt2,nt3,nt4);
	System.out.println("main thread Exiting");
}

	private static void threads_status(NewThread9 nta,NewThread9 ntb,NewThread9 ntc
			,NewThread9 ntd)
	{
		System.out.println("Thread Alpha Alive?"+nta.isAlive());
		System.out.println("Thread Beta Alive?"+ntb.isAlive());
		System.out.println("Thread Teta Alive?"+ntc.isAlive());
		System.out.println("Thread Gama Alive?"+ntd.isAlive());
	}
}

