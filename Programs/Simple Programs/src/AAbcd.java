
class MyOwn{
	int a,b,c;
	
	MyOwn(int i, int j,int k)
	{
		a = i;
		b = j;
		c = k;
		
	}
	
	int avg()
	{
		int z;
		
		z = (a+b+c)/3;
		
		return z;
	}
}

public class AAbcd {

	public static void main(String args[])
	{
		MyOwn obj=new MyOwn(34,52,22);
		int val = obj.avg();
		
		System.out.println("Avergae value is:"+val);
	}
}

