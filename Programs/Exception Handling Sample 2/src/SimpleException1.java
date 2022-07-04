
public class SimpleException1 {

	public static void main(String[] args) {
		System.out.println("in main");
		try
		{
			System.out.println("in try");
			int i = 42/0;//ArithmeticException may be thrown
			
			System.out.println("in try 2");
			
			int arr[] = new int[20];
			
			arr[54] = 23;//ArrayIndexOutOfBoundsException may be thrown
			System.out.println("in try 3");
			
			//close the file
		}
		catch(ArrayIndexOutOfBoundsException ae) //ArrayIndexOutOfBoundsException is class
		{
			
			System.out.println("ABE occurred:"+ae.getMessage()+" "+ae);
			ae.printStackTrace();
		}
		catch(ArithmeticException et) //ArithmeticException is class
		{
			System.out.println("CA:"+et.getMessage());
		}
		catch(Exception ep) //Exception is a class
		{
			System.out.println("in Exception:"+ep.getMessage());
		}
		finally{
			System.out.println("in Finally block");
		}
	}
}
