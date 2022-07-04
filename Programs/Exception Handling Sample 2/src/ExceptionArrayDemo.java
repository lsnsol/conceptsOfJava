class A2{
	private String city;
	private float temperature;
	
	public A2(String mycity, float mytemperature)
	{
		city = mycity;
		temperature = mytemperature;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public float getTemperature()
	{
		return temperature;
	}
}

public class ExceptionArrayDemo {

	public static void main(String[] args) {
		
		A2 arr[] = new A2[4];
		
		A2 oa = new A2("Bangalore",34.3f);
		
		arr[0] = oa;
		
		arr[1] = null; 
		
		arr[2] = new A2("Mumbai",35.3f);
		arr[3] = new A2("Chennai",36.3f);
		
		try{	
			//opened file
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i].getCity()+" "+arr[i].getTemperature());		
		}
		//close file
		}
		catch(NullPointerException npe)
		{
			//close file
			System.out.println("Null pointer:"+npe.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException aeo)
		{
			System.out.println("AIOOBE");
		}
		catch(Exception ep)
		{
			System.out.println("Null pointer:"+ep.getMessage());
		}
		finally{
			System.out.println("in finally...");
		}

	}

}
