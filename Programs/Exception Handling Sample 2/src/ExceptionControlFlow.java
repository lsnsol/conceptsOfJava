
public class ExceptionControlFlow {
	public static void main(String[] args){
		try{
			System.out.println("stmt 1");
			ExceptionControlFlow obj = new ExceptionControlFlow();
			System.out.println("stmt 2");
			obj.getClass(); //NullPointerException
			System.out.println("stmt 3");
		}
		catch(NullPointerException et)
		{
			System.out.println("stmt 4");
			System.out.println("Exception occurred:"+et.getMessage());
		}
		catch(Exception ep)
		{
			System.out.println("stmt 5");
		}
		
	}

}
