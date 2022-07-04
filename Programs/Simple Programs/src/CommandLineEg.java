
public class CommandLineEg {
	public static void main(String args[])
	{
		System.out.println("b4 args");
		for(String arg:args)
		{
			System.out.println("Value: "+arg);
		}
		System.out.println("aft args");
	}
}
