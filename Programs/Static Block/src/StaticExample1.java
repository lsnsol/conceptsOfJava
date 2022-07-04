//Example of static keyword
class Abcd1
{
	static int i;
	//i value is common to all object of Abcd
	//static members are associated with class, 
	//and not with object
	
	int j;
	//each object of Abcd, can have different value of j
	
	public int getI()
	{
		return i;
	}
	
	public int getJ()
	{
		stTest();
		return j;
	}
	
	//static data members/methods can be used in non static methods
	//but a static method can refer only static methods or data members
	public static void stTest()
	{
		Abcd1 o =new Abcd1();
		o.getI();
		System.out.println("This is static method");
		o.j = 10; //error, only static variables can be referenced
	}
}

public class StaticExample1 {
	
	
	public static void main(String args[])
	{
		Abcd1.i = 50;
		
		//Abcd1.j = 20; 
		//error, non static members cannot be accessed with class name
		
		Abcd1.stTest();
		
		Abcd1 obj = new Abcd1();
		obj.j = 34;
		//obj.i = 20;

		System.out.println("Abcd.i is "+Abcd1.i);
		
		System.out.println("obj.j is "+obj.j);		
		
	}
}
