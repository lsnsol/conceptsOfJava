
public class ThreadAnonymousInnerClass {
	private final static String str = "Java652.com";
	
	private static void logic(String from_where)
	{
		for(int i=0;i<str.length();i++){  
			try{  
				System.out.println(from_where+str.charAt(i));
			Thread.sleep(100);  //100 milliseconds
			}catch(InterruptedException e){
				System.out.println("Exception:"+e.getMessage());
			}  
		}
	}
		
	public static void main(String args[])
	{
		//Named object and Anonymous inner class
		Thread t1 = new Thread(){  
			
			//body of inner class
			public void run(){  	
				logic("Child Thread");
			}   
			}; 
			
			t1.start();
			
			logic("Main Thread");
	}
}
