package p1;

class Ab
{
	static void met2()
	{
		System.out.println("met2() in Ab");
	}
}

class Xy extends Ab
{
	/*public void met2()
	{
		
	}*/
	
	static void met1()
	{
		System.out.println("met1() in Xy");
	}
}

//static members of a Base class, are also inherited by Derived class
//static methods of Base class, cannot be overridden
public class StaticInheritance {
	public static void main(String[] args) {
		
		Xy.met2();
		
		Xy.met2();
	}
}
