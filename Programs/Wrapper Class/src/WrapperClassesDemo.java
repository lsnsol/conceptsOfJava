


public class WrapperClassesDemo {
public static void main(String[] arg)
{
	try
	{
	//Wrapper classes are the classes to represent primitive data types 
	//like int, float, etc...
	//Wrapper class objects can be used instead of basic types, 
	//where ever basic types are not allowed, directly
	Integer i = new Integer(32);
	
	//convert number in String format to int
	int j = Integer.parseInt("jhjhg");
	
	//Why to convert a number in String format to int?
	//since arithmetic operations cannot be directly performed on numbers which
	//are in String format
	
	String str8 = Integer.toHexString(54);
	System.out.println(str8);
	System.out.println(Integer.toBinaryString(54));

	System.out.println(j+ " \nMin Value:"+Integer.MIN_VALUE+
			"   Max Value:"+Integer.MAX_VALUE);
	//java.lang.NumberFormatException is thrown if the input 
	//String is invalid String
	
	//convert int to String format
	String str = String.valueOf(48);
	String str2 = String.valueOf(6.8);
	//String abcd = ""+56;
	
	float ft = Float.parseFloat("3.8f");
	System.out.println(ft);

	
	String str1 = String.valueOf(3.9f);
	
	System.out.println(" Float min value:"+Float.MIN_VALUE+"  Max Value:"+
			Float.MAX_VALUE);
	//Wrapper classes are available for other primitive data types as well, 
	//like Short,Byte,Long,Double,Boolean,Character
	//All wrapper classes are in java.lang package
	}
	catch(NumberFormatException nfe)
	{
		System.out.println("NumberFormatException "+nfe.getMessage());
	}
}
}




