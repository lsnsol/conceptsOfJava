public class ThrowDemo {
	public static void main(String[] args) throws Exception{
		try
		{
		myMet();
		}catch(Exception et)
		{
			System.out.println("Handlinh the Exception");
			et.printStackTrace();
		}
	}
	
	static void myMet() throws ArithmeticException, Exception
	{
		try
		{
			System.out.println("in try");
			int a,b;
			a = 3;
			b = 5;
			
			a +=b;
			System.out.println("b4 if");
			if(a>5)
			{
				System.out.println("b4 throwing the exception");
				Exception et = new Exception("Test Exception");
				throw et;
			}
			System.out.println("in try 2");
		
		}
		catch(ArithmeticException en)
		{
			
			System.out.println("ArithmeticException occurred:"
					+en.getMessage());
			
		}
		catch(Exception et)
		{
			System.out.println("Exception occurred:"
					+et.getMessage());
		}
	}

}
