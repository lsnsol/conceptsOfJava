
//An interface is a set of method declarations
//without method definitions
interface Test {
public void show();

public int met1();
}


class Test10Impl1 implements Test{
	public void show()
	{
		System.out.println("show() in Test10Impl1");
	}
	
	public int met1()
	{
		System.out.println("met1() in Test10Impl1");
		
		return 0;
	}
}

class Test10Impl2 implements Test{
	public void show()
	{
		System.out.println("show() in Test10Impl2");
	}
	
	public int met1()
	{
		System.out.println("met1() in Test10Impl2");
		
		return 0;
	}
}

public class Test10{
	public static void main(String[] args) {
		Test obj = new Test10Impl1();
		
		obj.met1();
		obj.show();
		
		obj = new Test10Impl2();
		
		obj.met1();
		obj.show();
	}
}
