class Base
{
	int i,j;
	
	public Base()
	{
		System.out.println("Base() constructor");
	}
	
	public Base(int i)
	{
		System.out.println("Base(int i) constructor");
	}
	
	public void show()
	{
		System.out.println("show() in Base class");
	}
}

class Derived extends Base
{
	int i,j;
	public Derived()
	{
		super();
		System.out.println("Derived() constructor");
	}
	
	public void show()
	{				
		//super(100);//error cosntructor can be invoked from constructor only
		super.i = 10;
		super.j = 20;
		System.out.println("show() in Derived class");
		
		super.show();
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		Base od = new Derived();
		//Derived od1 = new Base(); //error
		od.show();
	}
}
