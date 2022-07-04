
public class doWhileDemo {
	public static void main(String args[])
	{
		int test = 20;
		
		int g = (int)1.3;
		float xyz = (float)34.3; //Type Casting
		//Type Casting is Converting one data type to another data type
		
		boolean b = false;
		
		int k = 10;
		if(k>5)
		{
			while(xyz>0)
			{
				//short hand assignment operator
				xyz -=3; //means xyz = xyz - 3;
				System.out.println("while loop:"+xyz);
			}
		}
		
		System.out.println("---------------------------");
		do
		{
			//System.out.println("Hello");
			System.out.println("do while is:"+test);
			test--; //means test = test -1;
		}while(test>=0);
	}
}
