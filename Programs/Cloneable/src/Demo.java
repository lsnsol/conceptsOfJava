
class Test implements Cloneable{
	int i;
	String str;
 //Test(){}
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch(CloneNotSupportedException ce)
		{
			ce.printStackTrace();
			return null;
		}
	}
}

public class Demo {
	public static void main(String args[])
	{
		Test obj = new Test();
		
		obj.i = 10;
		obj.str = new String("testing");
		
		Test obj_clone = (Test)obj.clone();
		
		System.out.println("i="+obj.i+", string is "+obj_clone.str);
	}
}
