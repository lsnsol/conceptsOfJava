//Example of static keyword
class Abcd
{
	 static int i;
	//i value is common to all objects of Abcd
	//static members are associated with class, and not with individual object
	
	int k;
	int j;
	//each object of Abcd, can have different value of j

	
	 int getI()
	{
		getJ();
		return i;
	}
	
	 int getJ()
	{
		stTest();
		return j;
	}
	
	//static data members/methods can be used in non static methods
	//but a static method can refer only static methods or data members
	 static void stTest()
	{
		System.out.println("This is static method");
		
		//(new Abcd()).j = 10; 
		
		//j = 10; //error, only static variables can be directly accessed from static method
	}
}


public class StaticExample {
	
	float met1()
	{
		System.out.println("met1() in StaticExample class");
		return 0.0f;
	}
	
	public static void main(String args[])
	{
		Abcd.i = 50;
		
		//Abcd.j = 20; 
		//Compile error, j cannot be accessed directly with class name
		//because j is non static
		
		
		StaticExample se = new StaticExample();
		float s=se.met1();
		
		Abcd.stTest();

		Abcd obj = new Abcd();
		obj.j = 34;
		//obj.i = 20;

		System.out.println("Abcd.i is "+Abcd.i);
		
		System.out.println("obj.j is "+obj.j);		
	}
}
