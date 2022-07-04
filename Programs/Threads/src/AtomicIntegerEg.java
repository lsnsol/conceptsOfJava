import java.util.concurrent.atomic.AtomicInteger;



public class AtomicIntegerEg {
	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(6);


		System.out.println(atomicInteger.getAndAdd(10));
		System.out.println(atomicInteger.addAndGet(10));
		
		//decrementAndGet()
		//getAndDecrement()
	}
}
