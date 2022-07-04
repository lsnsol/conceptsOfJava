
public class FibonacciRecursion {
	public static void main(String args[])
	{
		int i = 0, j =1;
		fib(i,j);
	}
	
	private static void fib(int x, int y)
	{
		if(x>=100)
		{
			return;
		}
		
		System.out.print(y+"  ");
		
		fib(y, x+y);
	}
}
