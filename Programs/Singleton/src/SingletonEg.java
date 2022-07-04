
class Xyz{
	static Xyz obj=null;
	private Xyz()
	{
		System.out.println("Xyz() constructor");
	}
	
	//Factory Method
	static Xyz getXyz()
	{
		if(obj==null)
		{
			System.out.println("Creating new object");
			obj = new Xyz();
		}
		else
		{
			System.out.println("returning existing object");
		}
		
		return obj;
	}
}

public class SingletonEg {
	public static void main(String[] args) {
		//Xyz obj = new Xyz();
		Xyz tmp = Xyz.getXyz();
		
		Xyz tmp1 = Xyz.getXyz();
		
		Xyz tmp2 = Xyz.getXyz();
	}
}
