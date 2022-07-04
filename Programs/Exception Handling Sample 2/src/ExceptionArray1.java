class A5{
	private String city;
	private float temp;
	
	public A5(String mycity, float myt)
	{
		city = mycity;
		temp = myt;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public float getT()
	{
		return temp;
	}
}

public class ExceptionArray1 {

	public static void main(String[] args) {
		
		A5 arr[] = new A5[4];
		
		A5 oa = new A5("Bangalore",34.3f);
		
		arr[0] = oa;
		
		arr[1] = new A5("Mumbai",35.3f);
		arr[2] = new A5("Mumbai",35.3f);
		arr[3] = new A5("Kolkata", (float)34.5);
		

		//try{
			for(int i=0;i<arr.length;i++)
			{
				try{
				System.out.println(arr[i].getCity()+" "+arr[i].getT());
				}
				catch(NullPointerException npe)
				{
					System.out.println("Null pointer:"+npe.getMessage()+" "+npe);
				}
				catch(ArrayIndexOutOfBoundsException aeo)
				{
					System.out.println("AIOOBE"+aeo);
				}			
				catch(Exception ep)
				{
					System.out.println("Null pointer:"+ep.getMessage());
				
				}
			}

			
	}

}
