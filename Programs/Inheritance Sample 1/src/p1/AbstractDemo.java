package p1;

abstract class A1{
	//abstract int i; //error, abstract cannot be used with data members

	A1(){ //abstract not allowed with constructor
		System.out.println("A1() ");
		
	}
	public void met1(){
		System.out.println("met1() in A1");
	}
	
	abstract public int met2();
	
	abstract public void met3();
}


//class B1 need to be declared abstract as it does not implement met2() of A1 class
 abstract class B1 extends A1{

	
	public void met3()
	{
		System.out.println("met3() in B1");
	}
	
	//additional methods can be defined
	public void meta(){
		System.out.println("meta() in B1");
	}
}

class C1 extends B1{
	public int met2()
	{
		System.out.println("met2() in C1");
		return 0;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		B1 obj = new C1();
		
		obj.met3();
		obj.met1();
		obj.met2();
		

	}

}
