
public class MainThreadPriority {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Priority of "+t.getName()+" thread is: "+t.getPriority());
		
		t.setPriority(Thread.MAX_PRIORITY - 2);
		
		System.out.println("Now, Priority of "+t.getName()+" thread is: "+t.getPriority());
	}
}
