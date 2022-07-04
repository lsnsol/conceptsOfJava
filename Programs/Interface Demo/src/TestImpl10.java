
abstract class TestImpl9 implements Test10
{
	public void show(){
		System.out.println("show()");
	}


}

public class TestImpl10 extends TestImpl9{

	public int met1(){
		System.out.println("met1()");
		return 0;
	}
	
	public static void main(String args[])
	{
		TestImpl10 obj = new TestImpl10();
		obj.met1();
		obj.show();
	}
}
