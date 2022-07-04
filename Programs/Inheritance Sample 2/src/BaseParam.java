class A9{
	public void show(){
		System.out.println("show() method in A9 class");
	}
}

class B9 extends A9{
	public void show(){
		System.out.println("show() method in B9 class");
	}
}


public class BaseParam {

	public static void main(String[] args) {
		B9 tobj = new B9();
		met(tobj);
	}
	
	//object of derived class can be sent, when parameter type is base
	//this rule applies for return type as well
	static void met(A9 obj)
	{
		obj.show();
	}
}







