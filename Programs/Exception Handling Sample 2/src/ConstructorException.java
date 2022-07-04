
class Abcd{
	Abcd() throws Exception
	{
		System.out.println("Before throw");
		throw new Exception();
	}
}


public class ConstructorException {
	public static void main(String[] args) {
		try{
			System.out.println("main 1");
			Abcd obj = new Abcd();
			System.out.println("main 2");
		}
		catch(Exception et)
		{
			System.out.println("main 3");
			System.out.println("Exceptionn:"+et.getMessage());
		}
	}
}
