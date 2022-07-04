

class Xyz{
	public void met1()
	{
		
		//set of statements which may cause Exception
		//need to be enclosed in try block
		try
		{
			int j = 43,k=0;
			System.out.println("stmt 1");
			int i = j/k;
			System.out.println("stmt 2");
		}
		catch(ArithmeticException et)//Handler for Exception
		{
			System.out.println("details of exception is : "+et.getMessage());
		}
	}
}

public class Abc {
	public static void main(String args[])
	{
		System.out.println("in main");
		Xyz ox =new Xyz();
		ox.met1();
		System.out.println("exiting main");
	}
}
