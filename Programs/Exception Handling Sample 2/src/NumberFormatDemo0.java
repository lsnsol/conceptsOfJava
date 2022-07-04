
public class NumberFormatDemo0 {
	public static void main(String args[])
	{
		try{
		Integer io  = new Integer(23);
		
		//convert String format to int
		int i = Integer.parseInt("12jusaydgtasuydtas");
		
		//Pls check if Float.parseFloat();
		
		System.out.println(i+1);
		
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Exception occurred:"+nfe.getMessage());
		}
		
		System.out.println("after catch");
	}
}
