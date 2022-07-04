
public class ThreadAnonymousRunnable {
	
	private static void thread_body(String thread_name)
	{
		for(int i=0;i<10;i++)
    	{
    		System.out.println(thread_name+": "+i);
    		try
    		{
    			Thread.sleep(100);
    		}catch(InterruptedException ie){
    			System.out.println(ie.getMessage());
    		}
    	}
	}
	
	public static void main(String args[])
	{
		new Thread( new Runnable() {
		    public void run() {
		    	
		    	thread_body("child_thread");
		    }
		}).start();
		
		thread_body("main_thread");
	}
}
