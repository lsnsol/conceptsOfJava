
abstract class X
{
	abstract public void met1();
	
	abstract int met3();
	
	abstract int met4(double d);
	 void met2()
	{
		System.out.println("met2() in class X");
	}
}

class Y extends X
{
	public void met1()
	{
		System.out.println("met1() in class Y");
	}
	
	public int met3(){
		System.out.println("met3() in class Y");
		return 0;
	}
	
	public int met4(double d){
		System.out.println("met4() in class Y");
		
		return 0;
	}
}

public class Abs {
	public static void main(String args[])
	{
		X oy = new Y();
		
		oy.met1();
		oy.met2();
		int i = oy.met3();
		
	}
}
