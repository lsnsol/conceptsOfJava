package p1;

public class B extends A{
	public B()
	{
		System.out.println("B() Constructor");
	}
	
	public B(int j)
	{
		super();
		System.out.println("B() Constructor overloaded");
	}
}
