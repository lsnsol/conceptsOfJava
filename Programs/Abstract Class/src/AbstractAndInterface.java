
interface MyAbc
{
	//constants can be declared in interface
	int CHECK = 1;
	
	public void met1();
	
	public void met2();
}

abstract class X1 implements MyAbc
{

	public void met2(){
		System.out.println("met2() implemented in X1");
	}
}

class Y1 extends X1
{
	public void met1()
	{
		System.out.println("met1() implemented in Y1");
	}
	
	public double myMet()
	{
		System.out.println("myMet() implemented in Y1");
		
		return 0.0;
	}
}

public class AbstractAndInterface {
	public static void main(String args[])
	{
		MyAbc oy = new Y1();
		
		oy.met1();
		oy.met2();
		
		System.out.println(MyAbc.CHECK);
	}
}
