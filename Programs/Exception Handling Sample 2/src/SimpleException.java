
public class SimpleException {

	public static void main(String[] args){
		try{
			System.out.println("in try");
			
			int i=43,j=2,k;
			
			k = i/j;
			System.out.println("in try 2");
			
			try{
				if(true)
				{
					throw new Exception("Sample message");
				}
			}
			catch(ArithmeticException en)
			{
				System.out.println("Nested try catch:"+en.getMessage());
			}
			catch(Exception ep)
			{
				System.out.println("inner exception:"+ep.getMessage());
			}
			System.out.println("end of outside try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("outer ArithmeticException occurred:"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(" outerArray Bounds Exception occurred:"+ae.getMessage());
		}
		catch(Exception en)
		{
			en.printStackTrace();
			System.out.println("outer Exception occurred:"+en.getMessage());
		}
		finally{
			System.out.println("i am in outer finaly block");
		}
	}

}
