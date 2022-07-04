package p1;

public class C extends B{
	
	public C()
	{
	System.out.println("C() Constructor");
	}

	public C(int k)
	{
	super(k);	
	System.out.println("C() Constructor overloaded");
	}
	
	public static void main(String args[])
	{
		C oc = new C();
	}
}
