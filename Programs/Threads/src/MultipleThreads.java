
class NewThread implements Runnable{
	String name; //name of Thread
	Thread t;
	
	NewThread(String threadname){
		name=threadname;
		t = new Thread(this, name);
		System.out.println("New thread:"+t);
		//t.setName("hg")
		t.start();
	}
	
	public void run(){
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(t.getName()+":"+i);
				Thread.sleep(1000);//milliseconds
			}
		}
		catch(InterruptedException ie){
			System.out.println(name+" Interrupted");
		}
		
		System.out.println(name+" Exiting");
	}
}


public class MultipleThreads {
	
	public static void main(String args[])
	{
		//start the threads
		NewThread nt = new NewThread("Alpha");
		
		//anonymous object
		new NewThread("Beta");
		new NewThread("Teta");
		new NewThread("Gama");
	
	try
	{
		//Thread.sleep(20000);//milliseconds
	}catch(Exception ien)
	{
		System.out.println("main thread Interrupted");
	}
	System.out.println("main thread Exiting");
	}

}
