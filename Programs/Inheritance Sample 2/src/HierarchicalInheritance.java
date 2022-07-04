
class A8//A8 is common base class of B8 and C8
{
	public A8()
	{
		System.out.println("A8() Constructor");
	}
	
	public A8(int i)
	{
		System.out.println("A8() constructor:"+i);
	}
	
	public void show()
	{
		System.out.println("show() in A8");
	}
}

class B8 extends A8
{
	public B8()
	{
		System.out.println("B8() constructor");
	}	
	
	public void show()
	{
		System.out.println("show() in B8");
		super.show();
	}
}

class C8 extends A8
{
	public C8()
	{
		super(20);
		System.out.println("C8() constructor");
	}
	
	public void met2()
	{
		System.out.println("met2() in C8");
		show();
	}
}

public class HierarchicalInheritance {
public static void main(String args[])
{
	A8 obj = new B8();
	System.out.println("-------");
	C8 obj1 = new C8();
	
	obj.show();
	
	obj1.show();
	obj1.met2();
}
}
