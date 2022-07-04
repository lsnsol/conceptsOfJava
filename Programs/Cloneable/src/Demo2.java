
class Test2 implements Cloneable{
	int i;
	String str;
    Test2(int i, String str)
    {
    	this.i = i;
    	this.str = str;
    }
    
    Test2(Test2 obj)
    {
    	this.i = obj.i;
    	this.str = obj.str;
    }
    
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

public class Demo2 {
	public static void main(String args[])
	{
		Test2 obj = new Test2(10, "testing");
		
		Test2 obj_clone = (Test2)obj.clone();
		
		System.out.println(" After Cloning i="+obj.i+", string is "+obj_clone.str);
		
		Test2 obj_sc = new Test2(obj);
		
		System.out.println(" After Shallow Copy i="+obj_sc.i+", string is "+obj_sc.str);
	}
}
