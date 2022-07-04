
public class ConditionExample {
	public static void main(String args[])
	{
		int i = 56;
		double h = 4.56;
		
		if(h<5)
		{
			System.out.println("in if h<5");
		}
		else
		{
			System.out.println("in else");
		}
		
		
		
		
		if(i>1 && i<=5)
		{
			System.out.println("i is between 1 and 5");
		}
		else if(i>5 && i<=10)
		{
			System.out.println("i is between 5 and 10");
		}
		else if(i>15 && i<=20)
		{
			System.out.println("i is between 15 and 20");
		}
		else if(i>21 && i<=25)
		{
			System.out.println("i is between 21 and 25");
		}
		else
		{
			System.out.println("in else");
		}
	}
}
