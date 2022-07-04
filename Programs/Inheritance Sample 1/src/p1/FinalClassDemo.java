package p1;

/*final*/ class A5{
	int i,j;
	final public void show(){
		System.out.println("i="+i+",j="+j);
	}
}

class B5 extends A5{
	int k;
	public void met()
	{
		System.out.println("k="+k);
	}
	
	/*public void show(){
		System.out.println("show() from B5 class");
	}*/
}

public class FinalClassDemo {
	
	public static void main(String args[])
	{	
		A5 obj = new B5();
		
		obj.show();
		
		obj = new A5();
		
		obj.show();
	}
}
