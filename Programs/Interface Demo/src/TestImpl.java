
public class TestImpl implements Test{

	public void show(){
		System.out.println("show()");
	}

	public int met1(){
		System.out.println("met1()");
		return 0;
	}

	public void met2(){
		System.out.println("met2()");
		
	}
	
	//this method not declared in Test interface
	public float met3(){
		System.out.println("met3()");
		return 0;
	}
	
	public static void main(String args[])
	{
		TestImpl obj = new TestImpl();
		obj.met1();
		obj.met3();
	}
}
