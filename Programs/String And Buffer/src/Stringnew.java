
public class Stringnew {
public static void main(String args[])
{
	String str_a = "Hello";
	String str_b = "Hello";
	
	String str1 = new String("Hello");
	String str2 = new String("Hello");
	
	if(str_a==str_b)//== checks address location
	{ 
		System.out.println("if(str_a==str_b)");
	}
	else
	{
		System.out.println("else (str_a==str_b)");
	}
	
	if(str_a.equals(str_b))//equals() checks content
	{ 
		System.out.println("if str_a.equals(str_b)");
	}
	else
	{
		System.out.println("else str_a.equals(str_b)");
	}
	
	if(str1==str2)//== checks address location
	{ 
		System.out.println("if str1.equals(str2)");
	}
	else
	{
		System.out.println("else (str_a==str_b)");
	}
	
	if(str1.equals(str2))//equals() checks content
	{ 
		System.out.println("if str1.equals(str2)");
	}
	else
	{
		System.out.println("else str1.equals(str2)");
	}
}
}
