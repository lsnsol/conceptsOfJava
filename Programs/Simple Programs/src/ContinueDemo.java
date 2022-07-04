class Xyz{
	static int i,j;
	static final float PI = 3.14f;
	
	public double method1()
	{ 
		i = 10;
		j = 20;
		return 0.0; 
	}
	
	public static int myMet()
	{
		final int ABC=1;//constant
		i = 30;
		j = 50;
		System.out.println("This is static method");
		return 0;
	}
}


public class ContinueDemo {

public static void main(String args[])
{
Xyz.myMet();
}
}
