//extends with interface
interface Iabc{
	public int TEST_VAL = 20;
	 public void met1(); //final methods not allowed for methods in interface
	//private void met5(); //private not allowed within interface
}

//an interface cannot be final
/*final */interface Iabc1{
	public void met2();
}

//multiple interfaces is allowed between interfaces
interface Iabc2 extends Iabc,Iabc1{
	/*Iabc2() //constructors not allowed in interfaces
	{
		
	}*/
	public void met3();
	
	//static methods not allowed in interface
	/*public static void mets()
	{
		
	}*/
}

class MyClass implements Iabc2{
	public void met3()
	{
		System.out.println("met3() in MyClass");
	}
	
	public void met1()
	{
		System.out.println("met1() in MyClass");
	}
	
	public void met2()
	{
		System.out.println("met2() in MyClass");
	}
}

public class InterfaceExtend {
	public static void main(String args[])
	{
		MyClass obj = new MyClass();
		obj.met3();
	}
}
