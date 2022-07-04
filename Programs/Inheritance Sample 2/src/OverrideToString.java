//Overriding toString() method
class A2{
	int i,j;
	
	public A2(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	
	//toString() is originally defined in Object class
	//toString() is not final in Object class, hence it can be overridden
	public String toString()
	{
		String str = "\n i value is:"+i+"\n j value is:"+j;
		return str;
	}
}


public class OverrideToString {
public static void main(String args[])
{
	A2 oa = new A2(10,20);
	
	//in below statement toString() is implicitly invoked, to convert the oa object 
	//to a String, and further concatenates
	System.out.println("Check Value:"+oa.toString());
	
	//String str = ""+oa;
}
}
