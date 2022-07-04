class X1{
	X1(int a)
	{
		System.out.println("X1(int) constructor "+a);
	}
	
	X1()
	{
		System.out.println("X1() constructor ");
	}
	
	void disp()
	{
		System.out.println("disp() in X1");
	}
}

class Y1 extends X1{
	
	Y1()
	{
		super(12);
		System.out.println("Y1() Constructor");
	}
	
	
	void disp()
	{	
		System.out.println("disp() in Y1");
	}	
	
	int met()
	{
		disp();
		
		return 0;
	}
}


public class SuperDemo {
	public static void main(String[] args) {
		Y1 obj = new Y1();
		obj.disp();
		obj.met();
		
		System.out.println("Result is: "+obj);
	}
}
