class A2{
	private String city;
	private float temperature;
	
	public A2(String mycity, float mytemperature)
	{
		this.city = mycity;
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

public class ArrayDemo {

	public static void main(String[] args) {
		
		A2 arr[] = new A2[4];
		
		A2 oa = new A2("Bangalore",34.3f);
		
		arr[0] = oa; //new A2("Bangalore",34.3f);
		
		arr[1] = new A2("Chennai",36.3f);
		
		arr[2] = new A2("Mumbai",35.3f);
		
		arr[3] = new A2("New Delhi",38.3f);
		
		//System.out.println(arr[0].city);
		
		int i=0;
		
		//for(int i=0; i< arr.length; i++)
		while(i<arr.length)
		{    
			A2 tobj = arr[i];
			String str = tobj.getCity();
			System.out.println(str+" "+tobj.getTemperature());
			
			i++;
		}



	}

}