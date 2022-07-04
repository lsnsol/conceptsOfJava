package p1;


//if below line is uncommented, then A2 cannot be a base class
/*final*/ class A2{
	final public void met1(){
		System.out.println("met1() in A2");
	}
	
	//any other methods may be defined here
}


class B2 extends A2{
	/*public void met1(){ //cannot override final method met1()
		
	}*/
	
	//any other methods may be defined here
}

public class FinalDemo {
	final static int ABC = 1;
	public static void main(String[] args) {
		final int XYZ = 2;
		A2 oa = new A2();
System.out.println(ABC);
	}
}
