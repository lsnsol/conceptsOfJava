class A
{
	int i,j;
	
	public void show()
	{
		System.out.println("show() in class A");
	}
}

class C extends A{
	int k;
	
	public void show()
	{
		System.out.println("show() in class C");
	}
}

class D extends A{
	int k;
	
	public void show()
	{
		System.out.println("show() in class D");
	}
}

class E extends A{
	int k;
	
	public void show()
	{
		System.out.println("show() in class E");
	}
}
public class B{
	public static void main(String args[])
	{
		A obj = new C();
		obj.show();
		
		obj = new D();
		obj.show();
		
		obj = new E();
		obj.show();
		
		obj = new D();
		obj.show();
	}
}
