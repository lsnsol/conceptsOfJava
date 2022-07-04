public class Stringequals{
	
public static void main(String args[])
{
	String s1 =  new String("Bolo");
	String s2 = new String("Bolo");
	
	String str="Hello";
	
	String str1="Hello";
	
	if(s1==s2)//== checks address location
	{ 
		System.out.println("if(s1==s2)");
	}
	else
	{
		System.out.println("else (s1==s2)");
	}

	if(s1.equals(s2))// equals checks contents of s1 and s2
	{ 
		System.out.println("if s1 equals s2");
	}
	else
	{
		System.out.println("else s1 equals s2");
	}
	
	if(str==str1){
		System.out.println("if(str==str1)");
	}else
	{
		System.out.println("else (str==str1)");
	}
	

}
}