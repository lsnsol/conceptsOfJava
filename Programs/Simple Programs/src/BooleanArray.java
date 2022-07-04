
public class BooleanArray {
	
	public static void main(String args[])
	{
		boolean present[] = new boolean[3];//array declaration
		
		present[0] = true;
		present[1] = true;
		present[2] = false;
		
		for(int i = 0;i<3;i++)
		{
			if(present[i])
			{
			System.out.println(" Student "+i+" is present");
			}
			else
			{
			System.out.println(" Student "+i+" is absent");
			}	
		}
		
	}
}
