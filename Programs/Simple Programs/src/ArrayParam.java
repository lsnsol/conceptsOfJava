
public class ArrayParam {
	public static void main(String[] args) {
		int arr[] = { 23,9,11,42,3,65,4};
		
		int mval = arrayMax(arr);
		System.out.println("Maximum value is:"+mval);
	}
	
	static int arrayMax(int larr[])
	{
		int max_value = larr[0];
		
		for(int i=0;i<larr.length;i++)
		{
			if(max_value < larr[i])
			{
				max_value = larr[i];
			}
		}
		
		return max_value;
	}
}
