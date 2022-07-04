
/*final*/ class A1
{	
	final public void show()
	{
		System.out.println("show() in A1");
	}
}

//A1 cannot be base class of B1 , if A1 class is declared final
class B1 extends A1
{
	//if show() in A1 is final, cannot be overridden, compiler error occurs
	/*public void show() 
	{
		System.out.println("show() in B1");
	}*/
}


//For eg. wait(), notify(), notifyAll() methods are final in Object class
public class FinalDemo{
	public static void main(String args[])
	{
		B1 ob = new B1();
		ob.show();
	}
}
