
public class FirstProgram {
public static void main(String args[])
{
	//single line comment 
	int a = 10, b = 30/*initialization*/, c/*declaration*/;
	c = a + b;
	System.out.println("Result is "+c);
	
	c++;
	
	System.out.println("Aft increment "+c);
	
	int result=0;
	
	result+=c;
	result+=c;
	
	System.out.println("Final Result is "+result);
	
	
	
}
}
