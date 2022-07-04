class MyException extends Exception
{
	public String getMessage()
	{
		return "SampleException";
	}
}

/*class Aaaa{
	Aaaa() 
	{
		throw new ArithmeticException();
	}
}*/

public class TestExcp {
	
	public static void main(String args[])
	{
	
		try{
			throw new MyException();
		}
		catch(Exception en)
		{
			System.out.println("Exception has occurred:"+en.getMessage());
		}
	}

}
