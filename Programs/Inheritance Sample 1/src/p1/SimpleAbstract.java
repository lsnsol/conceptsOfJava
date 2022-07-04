package p1;


abstract class A11{
	public void met1(){
		System.out.println("met1() in A1");
	}
	
	//derived class of A11 need to define met2() method
	abstract public void met2();
	
	abstract public void met3();
}

abstract class B11 extends A11{
	public void met2()
	{
		System.out.println("met2() in B1");
	}
	

}

class C11 extends B11
{
	public void met3()
	{
		System.out.println("met3() in B1");
	}
}
public class SimpleAbstract {

	public static void main(String[] args) {
		//A11 ghj = new A11(); //abstract classes cannot be instantiated
		//B11 obj = new B11();
		C11 obj = new C11();
		obj.met1();
		obj.met2();
		obj.met3();
	}

}
